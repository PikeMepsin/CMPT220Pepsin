import java.lang.Math;
import java.util.Scanner;
//Programming problem 4.1  Mike Pepsin  Lab 2
public class lab2_4_1 {
  public static void main (String[] args) {
	double radius;
	double side;
	Scanner keyboard = new Scanner(System.in);
	System.out.print("Enter the length from the center of the pentagon to a vertex: ");
	radius = keyboard.nextDouble();
	System.out.println();
	
	side = (2*radius) * Math.sin(Math.PI/5);
	
	double Area = (5*Math.pow(side, 2)) / (4*Math.tan(Math.PI/5));
	Area *= 100;
	Area = Math.round(Area);
	Area /= 100;
	System.out.print("The area of the pentagon is: " + Area);
  }
}