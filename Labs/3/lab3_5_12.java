/*
  Mike Pepsin
  2/23/17
  Lab3
  5.12
*/
import java.lang.Math;
public class lab3_5_12 {
  public static void main(String[] args) {
	int num = -1;
	
	while (Math.pow(num,2) < 12000) {
	  num--;
	}
	System.out.println("n = " + num + "  n^2 = " + Math.pow(num,2));
  }
}