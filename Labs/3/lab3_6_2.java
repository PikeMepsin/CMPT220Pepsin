/*
  Mike Pepsin
  2/23/17
  Lab3
  6.2
*/
import java.util.Scanner;
public class lab3_6_2 {
  public static void main(String[] args) {
	Scanner keyboard= new Scanner(System.in);
	
	long number;
	System.out.println("Enter a number; the digits will be added: ");
	number = keyboard.nextLong();
	
	int sumDigits = sumDigits(number);
	
	System.out.println(sumDigits);
  }
  
  public static int sumDigits(long n) {
	int sum = 0;
	
	do {
	  sum += (n%10);
	  n /= 10;
	}while (n/1 != 0);
	
	return sum;
  }
}