package model;

public class Player extends GameObject implements IMovable{

	private double previousDistance;
	
	

	public Player(int posX, int posY) {
		super(posX, posY);
	}
	
	public double getPreviousDistance() {
		return previousDistance;
	}
	public void setPreviousDistance(double previousDistance) {
		this.previousDistance = previousDistance;
	}


	@Override
	public void move(int x, int y) {
		this.setPosX(x);
		this.setPosY(y);		
	}

	@Override
	public String toString() {
		return "Player";	
	}

	
	

}
