import java.util.Scanner;
public class lab1_2_5 {
  //Prints gratuity rate and total cost when given subtotal and gratuity rate by user
  public static void main (String[] args) {
	Scanner keyboard = new Scanner(System.in);
    System.out.println("Enter the subtotal: ");
	double subtotal = keyboard.nextDouble();
	System.out.println("Enter the gratuity rate as a number: ");
	double gRate = keyboard.nextDouble();
	
	double gratuity = (gRate/100) * subtotal;
	double total = gratuity + subtotal;
	System.out.println("The gratuity is $" + gratuity + " and the total is $" + total + ".");
  }  
}