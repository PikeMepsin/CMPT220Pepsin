import java.util.Scanner;
//Programming problem 4.26  Mike Pepsin  Lab 2
public class lab2_4_26 {
//ComputeChange.java revisited
  public static void main(String[] args) {
	Scanner keyboard = new Scanner(System.in);
	System.out.println("Enter a double amount, for example 11.56: ");
	String amount = keyboard.nextLine();
	//dollars
	String dollars = amount.substring(0,amount.indexOf('.'));
	//cents
	String cents = amount.substring(amount.indexOf('.')+1);
	System.out.println(dollars + " dollars and " + cents + " cents.");
  }
}