import java.util.Scanner;
//Programming problem 4.10  Mike Pepsin  Lab 2
public class lab2_4_10 {
  public static void main(String[] args) {
	String set1 = 
	  " 1  3  5  7\n" +
	  " 9 11 13 15\n" +
	  "17 19 21 23\n" +
	  "25 27 29 31";
	  
	String set2 = 
	  " 2  3  6  7\n" +
	  "10 11 14 15\n" +
	  "18 19 22 23\n" +
	  "26 27 30 31";
	  
	String set3 = 
	  " 4  5  6  7\n" +
	  "12 13 14 15\n" +
	  "20 21 22 23\n" +
	  "28 29 30 31";
	  
	String set4 =
	  " 8  9 10 11\n" +
	  "12 13 14 15\n" +
	  "24 25 26 27\n" +
	  "28 29 30 31";
	  
	String set5 =
	  "16 17 18 19\n" +
	  "20 21 22 23\n" +
	  "24 25 26 27\n" +
	  "28 29 30 31";
	
	int day = 0;
	
	Scanner keyboard = new Scanner(System.in);
	
	System.out.print("Is your birthday in Set1?\n");
	System.out.print(set1);
	System.out.print("\nEnter N for No and Y for Yes: ");
	String answer = keyboard.nextLine();
	
	if (answer.equals("Y") == true) {
	  day += 1;
	}
	//Used to test the program to see if it was correctly reading Y and N
	//System.out.println(day);
	
	System.out.print("Is your birthday in Set2?\n");
	System.out.print(set2);
	System.out.print("\nEnter N for No and Y for Yes: ");
	answer = keyboard.nextLine();
	
	if (answer.equals("Y") == true) {
	  day += 2;
	}
	
	System.out.print("Is your birthday in Set3?\n");
	System.out.print(set3);
	System.out.print("\nEnter N for No and Y for Yes: ");
	answer = keyboard.nextLine();
	
	if (answer.equals("Y") == true) {
	  day += 4;
	}
	
	System.out.print("Is your birthday in Set4?\n");
	System.out.print(set4);
	System.out.print("\nEnter N for No and Y for Yes: ");
	answer = keyboard.nextLine();
	
	if (answer.equals("Y") == true) {
	  day += 8;
	}
	
	System.out.print("Is your birthday in Set5?\n");
	System.out.print(set5);
	System.out.print("\nEnter N for No and Y for Yes: ");
	answer = keyboard.nextLine();
	
	if (answer.equals("Y") == true) {
	  day += 16;
	}
	
	System.out.println("Your birthday is " + day + "!");
  }
}