package model;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Game {
	
	private int boardSize;
	private ArrayList<GameObject> gameObjects = new ArrayList<GameObject>();
	private Player player;
	private Robot robot;
	private Treasure treasure;
	
	
	
	public Game(int boardSize) throws Exception {
		super();
		if (boardSize < 3) throw new Exception("There is no space for all GameObjects(INFINITE LOOP)!");
		this.boardSize = boardSize;
		Random rnd = new Random();
		
		ArrayList<int[]> uniquePositions = new ArrayList<int[]>();
		int[] firstPos = new int[] {rnd.nextInt(boardSize), rnd.nextInt(boardSize)};
		
		uniquePositions.add(firstPos);
		outer:
		while (uniquePositions.size() != 6) {
			int possiblePosX = rnd.nextInt(boardSize);
			int possiblePosY = rnd.nextInt(boardSize);
			//inner:
			for (int[] uniquePos : uniquePositions) {
				if (uniquePos[0] == possiblePosX && uniquePos[1] == possiblePosY) {
					continue outer;
				}
			}
			
			int[] nextPos = new int[] {possiblePosX, possiblePosY};
			uniquePositions.add(nextPos);
		}
		
		
		gameObjects.add(new Tree(uniquePositions.get(0)[0], uniquePositions.get(0)[1]));
		gameObjects.add(new Tree(uniquePositions.get(1)[0], uniquePositions.get(1)[1]));
		gameObjects.add(new House(uniquePositions.get(2)[0], uniquePositions.get(2)[1]));
		
		
		player = new Player(uniquePositions.get(3)[0], uniquePositions.get(3)[1]);
		robot = new Robot(uniquePositions.get(4)[0], uniquePositions.get(4)[1]);
		treasure = new Treasure(uniquePositions.get(5)[0], uniquePositions.get(5)[1]);
		
		player.setPreviousDistance(calculateDistance());
	}
	
	public void play() {
		Scanner sc = new Scanner(System.in);
		Random rnd = new Random();
		
		//// test
		System.out.println("---------TEST-----------");
		for (GameObject gameObject : gameObjects) {
			System.out.println(gameObject.toString() + " " +gameObject.getPosX()+gameObject.getPosY());
		}
		System.out.println("robot "+robot.getPosX()+robot.getPosY());
		System.out.println("treasure "+treasure.getPosX() +treasure.getPosY());
		System.out.println("------------------------");
		////test		
		
		outer:
		for (int i = 1; i <= 10; i++) {
			System.out.println("Turn:" + i);
			System.out.println("You are in position x:" + player.getPosX() + " y:" + player.getPosY());
			System.out.println("Please enter position x for player:");
			int newX = sc.nextInt();
			System.out.println("Please enter position y for player:");
			int newY = sc.nextInt();
			
			if (newX < boardSize && newY < boardSize) {
				if (newX == robot.getPosX() && newY == robot.getPosY()) {
					System.out.println("You hit the robot!\nYou lost the game");
					return;
				}else if(newX == treasure.getPosX() && newY == treasure.getPosY()) {
					System.out.println("You found the treasure!\nYou won the game");
					return;
				}else {
					inner:
					for (GameObject gameObject : gameObjects) {
						if(newX == gameObject.getPosX() && newY == gameObject.getPosY()) {
							System.out.println("You cannot go there, there is a " + gameObject.toString() + ".");
							robot.move(rnd.nextInt(boardSize), rnd.nextInt(boardSize));
							
							if (treasure.getPosX() == robot.getPosX() && treasure.getPosY() == robot.getPosY()) {
								System.out.println("Robot found the tresure!\nYou lost the game");
								return;
							}
							continue outer;
						}
					}
					
					player.move(newX, newY);
					robot.move(rnd.nextInt(boardSize), rnd.nextInt(boardSize));
					
					//// test
					System.out.println("---------TEST-----------");
					for (GameObject gameObject : gameObjects) {
						System.out.println(gameObject.toString() + " " +gameObject.getPosX()+gameObject.getPosY());
					}
					System.out.println("robot "+robot.getPosX()+robot.getPosY());
					System.out.println("treasure "+treasure.getPosX() +treasure.getPosY());
					System.out.println("------------------------");
					////test
					
					if (treasure.getPosX() == robot.getPosX() && treasure.getPosY() == robot.getPosY()) {
						System.out.println("Robot found the tresure!\nYou lost the game");
						return;
					}
					
					if (player.getPreviousDistance() < calculateDistance()) {
						System.out.println("You are getting far to the treasure");
					}else System.out.println("You are getting closer to the treasure");
					
					player.setPreviousDistance(calculateDistance());
					
				}
			}else System.out.println("You cannot go there, there is outside of the bound.");
			
			
		}
		
	}
	
	public double calculateDistance() {
		double distance = 0;
		double xDistance = player.getPosX() - treasure.getPosX();
		double yDistance = player.getPosY() - treasure.getPosY();
		distance = Math.sqrt((xDistance * xDistance) + (yDistance * yDistance));
		return distance;
	}


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean invalidEntry = false;
		int size;
		
		do {
			try {
				System.out.println("Please enter the board size:");
				size = sc.nextInt();
				if (size<5) {
					System.out.println("Invalid entry! ");
					System.out.println("Size cannot be less than 5.");
					invalidEntry = true;
				}
				else {
					Game game = new Game(size);
					game.play();
					invalidEntry = false;
				}
				
			} catch (Exception e) {
				System.out.println("Invalid entry! " + e);
				invalidEntry = true;
			}
			
		} while (invalidEntry);
		
		
		
		
		
		
	}
}
