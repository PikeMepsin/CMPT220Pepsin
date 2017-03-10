//Mike Pepsin
//Lab 4
//3/9/17
import java.util.Scanner;
public class lab4_7_9  {
  public static void main(String[] args) {
	Scanner keyboard = new Scanner(System.in);
	double array[] = new double[10];
	array[0] = keyboard.nextDouble();
	array[1] = keyboard.nextDouble();
	array[2] = keyboard.nextDouble();
	array[3] = keyboard.nextDouble();
	array[4] = keyboard.nextDouble();
	array[5] = keyboard.nextDouble();
	array[6] = keyboard.nextDouble();
	array[7] = keyboard.nextDouble();
	array[8] = keyboard.nextDouble();
	array[9] = keyboard.nextDouble();
	System.out.println("int returned: " + average(array));
	System.out.println("double returned: " + average(array));
  }
  
  public static int average(int[] arr) {
	double sum1 = 0;
	for (int j = 0; j < arr.length; j++) {
	  sum1 += arr[j];
	}
	return ((int)(sum1/10));
  }
  
  public static double average(double[] arr) {
	double sum2 = 0;
	for (int i = 0; i < arr.length; i++) {
	  sum2 += arr[i];
	}
	return (sum2/10);
  }
}