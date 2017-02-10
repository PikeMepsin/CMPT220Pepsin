import java.util.Scanner;
//Programming problem 4.8  Mike Pepsin  Lab 2
public class lab2_4_8 {
  public static void main(String[] args) {
	Scanner keyboard = new Scanner(System.in);
	System.out.println("Enter an integer between 0 and 127: ");
	int code = keyboard.nextInt();
	char output = (char)code;
	
	System.out.println(output);
  }
}