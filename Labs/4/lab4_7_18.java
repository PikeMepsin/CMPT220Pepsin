//Mike Pepsin
//Lab 4
//3/9/17
import java.util.Scanner;
public class lab4_7_18 {
  public static void main(String[] args) {
	Scanner keyboard = new Scanner(System.in);
	double test[] = new double[10];
	test[0] = keyboard.nextDouble();
	test[1] = keyboard.nextDouble();
	test[2] = keyboard.nextDouble();
	test[3] = keyboard.nextDouble();
	test[4] = keyboard.nextDouble();
	test[5] = keyboard.nextDouble();
	test[6] = keyboard.nextDouble();
	test[7] = keyboard.nextDouble();
	test[8] = keyboard.nextDouble();
	test[9] = keyboard.nextDouble();
	
	bubbleSort(test);
  }
  
  public static void bubbleSort(double[] arr) {
	for (int p = arr.length; p >= 0; p--) {
	  for (int g = 0; g < arr.length - 1; g++) {
		int y = g + 1;
		if (arr[g] > arr[y]) {
		  swap(g, y, arr);
		}
	  }
	}
	printArr(arr);
  }
  
  public static void swap(int w, int r, double[] array) {
	double temp;
	temp = array[w];
	array[w] = array[r];
	array[r] = temp;
  }
  
  public static void printArr(double[] nums) {
	for (int t = 0; t < nums.length; t++) {
	  System.out.print(nums[t] + " ");
	  System.out.println();
	}
  }
}