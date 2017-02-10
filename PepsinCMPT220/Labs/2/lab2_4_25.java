import java.lang.Math;
//Programming problem 4.25  Mike Pepsin  Lab 2
public class lab2_4_25 {
  public static void main(String[] args) {
	  //difference between ASCII codes for Z and A +1
	  int range = (90 - 65) + 1;
	  //Numbers
	  int dig1 = (int)(Math.random() * 10);
	  int dig2 = (int)(Math.random() * 10);
	  int dig3 = (int)(Math.random() * 10);
	  int dig4 = (int)(Math.random() * 10);
	  //Letters
	  int dig5 = (int)(Math.random() * range + 65);
	  int dig6 = (int)(Math.random() * range + 65);
	  int dig7 = (int)(Math.random() * range + 65);
	  char char1 = (char)dig5;
	  char char2 = (char)dig6;
	  char char3 = (char)dig7;
	  
	  System.out.println(char1 + "" + char2 + "" + char3 + "" + dig1 + "" + dig2 + "" + dig3 + "" + dig4);
  }
}