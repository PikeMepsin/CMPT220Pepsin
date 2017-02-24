import java.lang.Math;
import java.util.Scanner;
public class lab2_4_5 {
//Programming problem 4.5  Mike Pepsin  Lab 2
  public static void main(String[] args) {
	Scanner keyboard = new Scanner(System.in);
	System.out.println("Enter the number of sides: ");
	double sideNum = keyboard.nextDouble();
	System.out.println("Enter the length of the sides: ");
	double sideLen = keyboard.nextDouble();
	
	double Area = (sideNum * Math.pow(sideLen, 2)) / (4 * Math.tan(Math.PI/sideNum));
	System.out.print("The area is: " + Area);
  }
}