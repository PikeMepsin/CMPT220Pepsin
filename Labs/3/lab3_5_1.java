/*
  Mike Pepsin
  2/23/17
  Lab3
  5.1
*/
import java.util.Scanner;
public class lab3_5_1 {
  public static void main(String[] args) {
	Scanner keyboard=new Scanner(System.in);
	double sum = 0;
	double counter = 0;
	int posCount = 0;
	int negCount = 0;
	int data;
	
	do {
	  System.out.println("Enter an integer (the input ends if 0 is entered): ");
	  data = keyboard.nextInt();
	  if (data > 0) {
		posCount++;
	  }
	  if (data < 0) {
		negCount++;
	  }
	  counter++;
	  sum += data;
	} while (data != 0);
	counter--;
	double avg = (sum / counter);
	// used to check if program worked: System.out.println(counter);
	System.out.println("The average: " + avg);
	System.out.println("The number of positive numbers: " + posCount);
	System.out.println("The number of negative numbers: " + negCount);
  }
}