import java.util.Scanner;
public class lab2part2 {
  //Lab 2 part 2  Mike Pepsin
  //This class asks for 4 grades, and follows the CMPT220 rubric to output a final grade for the user.
  public static void main (String[] args) {
	Scanner keyboard = new Scanner(System.in);
	System.out.println("What is your grade for homeworks and labs?");
	double hwLabs = keyboard.nextDouble();
	hwLabs *= .4;
	System.out.println("What is your grade for projects?");
	double prjGrade = keyboard.nextDouble();
	prjGrade *= .2;
	System.out.println("What is your midterm grade?");
	double midterm = keyboard.nextDouble();
	midterm *= .2;
	System.out.println("What is your grade on the final?");
	double finalGrade = keyboard.nextDouble();
	finalGrade *= .2;
	double semesterGrade = hwLabs + prjGrade + midterm + finalGrade;
	
	if (semesterGrade >= 95) {
	  System.out.println("Your final grade is: A");
	}
	else if (semesterGrade >= 90 && semesterGrade < 95) {
	  System.out.println("Your final grade is: A-");
	}
	else if (semesterGrade >= 87 && semesterGrade < 90) {
	  System.out.println("Your final grade is: B+");
	}
	else if (semesterGrade >= 83 && semesterGrade < 87) {
	  System.out.println("Your final grade is: B");
	}
	else if (semesterGrade >= 80 && semesterGrade < 83) {
	  System.out.println("Your final grade is: B-");
	}
	else if (semesterGrade >= 77 && semesterGrade < 80) {
	  System.out.println("Your final grade is: C+");
	}
	else if (semesterGrade >= 73 && semesterGrade < 77) {
	  System.out.println("Your final grade is: C");
	}
	else if (semesterGrade >= 70 && semesterGrade < 73) {
	  System.out.println("Your final grade is: C-");
	}
	else if (semesterGrade >= 65 && semesterGrade < 70) {
	  System.out.println("Your final grade is: D+");
	}
	else if (semesterGrade >= 60 && semesterGrade < 65) {
	  System.out.println("Your final grade is: D");
	}
	else {
	  System.out.println("Your final grade is: F");
	}
  }
}