import java.lang.Math;
//Programming problem 3.4  Mike Pepsin  Lab 2
public class lab2_3_4 {
  public static void main (String[] args) {
	int randMonth = (int)(Math.random() * 12 + 1);
	if (randMonth == 1) {
	  System.out.println("January");
	}
	else if (randMonth == 2) {
	  System.out.println("February");
	}
	else if (randMonth == 3) {
	  System.out.println("March");
	}
	else if (randMonth == 4) {
	  System.out.println("April");
	}
	else if (randMonth == 5) {
	  System.out.println("May");
	}
	else if (randMonth == 6) {
	  System.out.println("June");
	}
	else if (randMonth == 7) {
	  System.out.println("July");
	}
	else if (randMonth == 8) {
	  System.out.println("August");
	}
	else if (randMonth == 9) {
	  System.out.println("September");
	}
	else if (randMonth == 10) {
	  System.out.println("October");
	}
	else if (randMonth == 11) {
	  System.out.println("November");
	}
	else if (randMonth == 12) {
	  System.out.println("December");
	}
  }
}