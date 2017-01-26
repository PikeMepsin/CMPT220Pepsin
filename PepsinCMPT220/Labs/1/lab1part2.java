import java.util.Scanner;
public class lab1part2 {
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
	System.out.println("Your final grade is: " + semesterGrade);
  }
}