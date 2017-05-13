//Mike Pepsin
//Lab 5
//7.20
//3/30/17 Spring
import java.util.Scanner;
  public class lab5_7_20 {
    public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);
    double[] arr = new double[10];
    arr[0] = keyboard.nextDouble();
    arr[1] = keyboard.nextDouble();
    arr[2] = keyboard.nextDouble();
    arr[3] = keyboard.nextDouble();
    arr[4] = keyboard.nextDouble();
    arr[5] = keyboard.nextDouble();
    arr[6] = keyboard.nextDouble();
    arr[7] = keyboard.nextDouble();
    arr[8] = keyboard.nextDouble();
    arr[9] = keyboard.nextDouble();
    /*for (int i = 0; i<10;i++) {
      System.out.print(arr[i] + " ");
    }    used for testing the sort method*/
    sSort(arr);
    }
  
    public static void sSort(double[] array) { // method sorts the array
    int j,k,bigInd;
    double temp,big;
	
    for (j = 0; j < array.length-1; j++) {
      big = array[j];
      bigInd = j;
      for (k = j+1; k < array.length; k++) {
        if (big > array[k]) {
          big = array[k];
          bigInd = k;
        }
      }
        if (bigInd != j) {
          temp = array[j];
          array[j] = array[bigInd];
          array[bigInd] = temp;
        }
    }
    for (int w=0; w<array.length; w++) {
      System.out.print(array[w] + " ");
    }
  }
}