import java.util.Scanner;
//Programming problem 4.21  Mike Pepsin  Lab 2
public class lab2_4_21 {
  public static void main(String[] args) {
	Scanner keyboard = new Scanner(System.in);
	
	System.out.println("Enter your social security number: ");
	String ssNum = keyboard.nextLine();
	
	for (int index = 0; index < 3; index++) {
	  if ((ssNum.charAt(index) != 0) && (ssNum.charAt(index) != 1) && (ssNum.charAt(index) != 2) && (ssNum.charAt(index) != 3) && (ssNum.charAt(index) != 4) && (ssNum.charAt(index) != 5) && (ssNum.charAt(index) != 6) && (ssNum.charAt(index) != 7) && (ssNum.charAt(index) != 8) && (ssNum.charAt(index) != 9)) {
		System.out.println("Invalid SSN");
		break;
	  }
	}
	for (int index = 4; index < 6; index++) {
	  if (ssNum.charAt(index) != 0 && ssNum.charAt(index) != 1 && ssNum.charAt(index) != 2 && ssNum.charAt(index) != 3 && ssNum.charAt(index) != 4 && ssNum.charAt(index) != 5 && ssNum.charAt(index) != 6 && ssNum.charAt(index) != 7 && ssNum.charAt(index) != 8 && ssNum.charAt(index) != 9) {
		System.out.println("Invalid SSN");
		break;
	  }
	}
	for (int index = 7; index <= 10; index++) {
	  if (ssNum.charAt(index) != 0 && ssNum.charAt(index) != 1 && ssNum.charAt(index) != 2 && ssNum.charAt(index) != 3 && ssNum.charAt(index) != 4 && ssNum.charAt(index) != 5 && ssNum.charAt(index) != 6 && ssNum.charAt(index) != 7 && ssNum.charAt(index) != 8 && ssNum.charAt(index) != 9) {
		System.out.println("Invalid SSN");
		break;
	  }
	}
	System.out.println("Valid SSN");
  }
}