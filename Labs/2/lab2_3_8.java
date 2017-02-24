import java.util.Scanner;
//Programming problem 3.8  Mike Pepsin  Lab 2
public class lab2_3_8 {
  public static void main(String[] args) {
	Scanner keyboard = new Scanner(System.in);
	System.out.println("Enter a number: ");
	int enter1 = keyboard.nextInt();
	
	System.out.println("Enter a second number: ");
	int enter2 = keyboard.nextInt();
	
	System.out.println("Enter a third number: ");
	int enter3 = keyboard.nextInt();
	
	if (enter1 <= enter3 && enter1 <= enter2) {
	  System.out.println(enter1 + " " + enter2 + " " + enter3);
	}
	else if (enter2 <= enter3 && enter2 <= enter1) {
	  System.out.println(enter2 + " " + enter3 + " " + enter1);
	}
	else {
	  System.out.println(enter3 + " " + enter2 + " " + enter1);
	}
  }
}