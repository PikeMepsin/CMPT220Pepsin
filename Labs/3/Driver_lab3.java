/*
  Mike Pepsin
  2/23/17
  Lab3
  Kattis : p-norms
*/
import java.util.Scanner;
public class Driver_lab3 {
  public static void main(String[] args) {
	Scanner keyboard = new Scanner(System.in);
	
	double x1 = 0;
	double x2 = 0;
	double y1 = 0;
	double y2 = 0;
	double p = 0;
	
	while (true) {
	  x1 = keyboard.nextDouble();
	  if (x1 == 0) {
	    break;
	  }
	  y1 = keyboard.nextDouble();
	  x2 = keyboard.nextDouble();
	  y2 = keyboard.nextDouble();
	  p = keyboard.nextDouble();
	
	double result;
	
	result = Math.pow(Math.pow(Math.abs(x1-x2),p) + Math.pow(Math.abs(y1-y2),p), 1/p);
	System.out.println(result);
	}
	/*double result;
	
	result = Math.pow(Math.pow(Math.abs(x1-x2),p) + Math.pow(Math.abs(y1-y2),p), 1/p);
	System.out.print(result);
	*/
  }
}