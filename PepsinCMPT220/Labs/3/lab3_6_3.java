/*
  Mike Pepsin
  2/23/17
  Lab3
  6.3
*/
import java.util.Scanner;
public class lab3_6_3 {
  public static void main(String[] args) {
	Scanner keyboard = new Scanner(System.in);
	
	System.out.println("Enter a number: ");
	int test = keyboard.nextInt();
	
	boolean isPalindrome = isPalindrome(test);
	System.out.println(test + " is a palindrome: " + isPalindrome);
  }
  
  public static boolean isPalindrome(int number) {
	boolean palinCheck = false;
	if (number == reverse(number)) {
	  palinCheck = true;
	}
	return palinCheck;
  }
  
  public static int reverse(int value) {
	int revrs = 0;
	int proxy = 0;
	while (value > 0) {
	  revrs = value % 10;
	  proxy = proxy * 10 + revrs;
	  value = value / 10;
	}
	//System.out.println(proxy);
	return proxy;
  }
}