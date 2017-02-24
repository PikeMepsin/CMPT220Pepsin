import java.util.Scanner;
public class lab1_2_6 {
  //Takes an input number and prints the sum of its digits.
  public static void main (String[] args) {
	Scanner keyboard = new Scanner(System.in);
	System.out.println("Enter a number between 0 and 1000: ");
	int numDigits = keyboard.nextInt();
	//numDigits is the input number.
	int total = 0;
	//total is the sum of the digits.
    total += (numDigits % 10);
	numDigits /= 10;
	total += (numDigits % 10);
	numDigits /= 10;
	total += (numDigits % 10);
	System.out.println("The sum of the digits is " + total + ".");
  }
}