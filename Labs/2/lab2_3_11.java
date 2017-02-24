import java.util.Scanner;
//Programming problem 3.11  Mike Pepsin  Lab 2
public class lab2_3_11 {
  public static void main(String[] args) {
	Scanner keyboard = new Scanner(System.in);
	
	System.out.println("Enter a month number: ");
	int month = keyboard.nextInt();
	System.out.println("Enter a year: ");
	int year = keyboard.nextInt();
	
	switch (month) {
	  case 1: System.out.println("31 days"); break;
	  case 2: if (year % 4 == 0) {
			    System.out.println("29 days"); break;
			  }
			  else {
				System.out.println("28 days"); break;  
			  }
	  case 3: System.out.println("31 days"); break;
	  case 4: System.out.println("30 days"); break;
	  case 5: System.out.println("31 days"); break;
	  case 6: System.out.println("30 days"); break;
	  case 7: System.out.println("31 days"); break;
	  case 8: System.out.println("31 days"); break;
	  case 9: System.out.println("30 days"); break;
	  case 10: System.out.println("31 days"); break;
	  case 11: System.out.println("30 days"); break;
	  case 12: System.out.println("31 days"); break;
	}
  }
}