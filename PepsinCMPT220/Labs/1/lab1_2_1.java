import java.util.Scanner;
public class lab1_2_1 {
  
  //Converts an input Celsius temperature to Fahrenheit
  public static void main (String[] args) {
	Scanner keyboard = new Scanner(System.in);
	double fahrenheit;
	//will store the value of the temperature after it is converted from Celsius.
	double celsius;
	//will be assigned a value by the user to be converted to Fahrenheit.
	System.out.print("What is the temperature in Celsius?  ");
	celsius = keyboard.nextDouble();
	System.out.println();
	fahrenheit = (9 * celsius)/5 + 32;
	System.out.println(celsius + " Celsius is " + fahrenheit + " Fahrenheit.");
  }
}