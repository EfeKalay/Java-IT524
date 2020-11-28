import java.util.Scanner;

import javax.swing.Spring;

public class GradeCalc {
	
	
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Midterm Exam: ");
	float midterm = sc.nextFloat();
	
	System.out.println("Essay: ");
	float essay = sc.nextFloat();
	
	System.out.println("Discussion: ");
	float discussion = sc.nextFloat();
	
	System.out.println("In-Lecture: ");
	float inLecture = sc.nextFloat();
	
	String letterGrade = letterGrade(overallCalc(midterm, essay, discussion, inLecture));
	System.out.println("Your lettergrade is " + letterGrade1);
	
}

static float overallCalc (float midterm, float essay, float discussion, float inLecture) {
	float overallGrade = 0;
	
	overallGrade = midterm*4/10 + essay*3/10 + discussion*2/10 + inLecture/10;
	
	System.out.println("Overall grade = " + overallGrade);
	return overallGrade;
}

static String letterGrade(float overallGrade) {
	String letterGrade = "NA";
	
	if (overallGrade>=90) letterGrade = "A";
	else if (overallGrade>85) letterGrade = "A-";
	else if (overallGrade>81) letterGrade = "B+";
	else if (overallGrade>77) letterGrade = "B";
	else if (overallGrade>73) letterGrade = "B-";
	else if (overallGrade>69) letterGrade = "C+";
	else if (overallGrade>65) letterGrade = "C";
	else if (overallGrade>61) letterGrade = "C-";
	else if (overallGrade>57) letterGrade = "D+";
	else if (overallGrade>53) letterGrade = "D";
	else letterGrade = "F";
	
	return letterGrade;
}

}
