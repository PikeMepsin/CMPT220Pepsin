//Mike Pepsin
//Lab 4
//3/9/17
import java.util.Scanner;
public class lab4_6_20 {
  public static void main(String[] args) {
	Scanner keyboard = new Scanner(System.in);
	System.out.println("Enter a string");
	String letters = keyboard.next();
	System.out.println(countLetters(letters));
  }
  
  public static int countLetters(String s) {
	int count = 0;
	for (int k = 0; k < s.length(); k++) {
	  char d = s.charAt(k);
	  if (Character.isLetter(d)) {
		count++;
	  }
	}
	return count;
  }
}