import java.lang.Math;
import java.util.Scanner;
//Programming problem 3.15  Mike Pepsin  Lab 2
public class lab2_3_15 {
  public static void main(String[] args) {
	Scanner keyboard = new Scanner(System.in);
	int lottery = (int) (Math.random() * 900 + 100);
	// used to test scenario = 2 and scenario = 3   System.out.println(lottery);
	System.out.println("Enter a 3-digit guess at the lottery: ");
	int guess = keyboard.nextInt();
	
	int lottDigit1 = lottery % 10;
	int lottDigit2 = (lottery/10) % 10;
	int lottDigit3 = (lottery/100) % 10;
	
	int guessDigit1 = guess % 10;
	int guessDigit2 = (guess/10) % 10;
	int guessDigit3 = (guess/100) % 10;
	
	int scenario = 0;
	if (guess == lottery) {
	  scenario = 1;
	}
	else if ((lottDigit1 == guessDigit1 || lottDigit1 == guessDigit2 || lottDigit1 == guessDigit3) && (lottDigit2 == guessDigit1 || lottDigit2 == guessDigit2 || lottDigit2 == guessDigit3) && (lottDigit3 == guessDigit1 || lottDigit3 == guessDigit2 || lottDigit3 == guessDigit3)) {
	  scenario = 2;
	  //tests for matching digits but out of order
	}
	else if ((lottDigit1 == guessDigit1 || lottDigit1 == guessDigit2 || lottDigit1 == guessDigit3) || (lottDigit2 == guessDigit1 || lottDigit2 == guessDigit2 || lottDigit2 == guessDigit3) || (lottDigit3 == guessDigit1 || lottDigit3 == guessDigit2 || lottDigit3 == guessDigit3)) {
	  scenario = 3;
	  //tests for any matching number
	}
	//prints the lottery number so you can be sure of the results
	System.out.println("The number is " + lottery);
	
	switch (scenario) {
	  case 0: System.out.println("You get nothing..."); break;
	  case 1: System.out.println("You get $10,000!"); break;
	  case 2: System.out.println("You get $3,000!"); break;
	  case 3: System.out.println("You get $1,000!"); break;
	}
  }
}