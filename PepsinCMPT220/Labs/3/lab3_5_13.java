/*
  Mike Pepsin
  2/23/17
  Lab3
  5.13
*/
import java.lang.Math;
public class lab3_5_13 {
  public static void main(String[] args) {
	int num = 1;
	
	while (Math.pow(num,3) < 12000) {
	  num++;
	}
	System.out.println("n = " + num + "  n^3 = " + Math.pow(num,3));
  }
}