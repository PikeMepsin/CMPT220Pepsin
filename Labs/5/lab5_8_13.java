//Mike Pepsin
//Lab 5
//8.13
//3/30/17 Spring

import java.util.Scanner;
public class lab5_8_13 {
  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);
    
    System.out.println("Enter the number of rows and columns of the array: ");
    int rows = keyboard.nextInt();
    int columns = keyboard.nextInt();
    
    double[][] arr = new double[rows][columns];
    
    //Fills the array
    System.out.println("Enter the array: ");
    for (int i = 0; i < rows; i++) {
      for (int w = 0; w < columns; w++) {
        arr[i][w] = keyboard.nextDouble();
      }
    }
    locateLargest(arr);
  }
  
  public static int[] locateLargest(double[][] arr1) {
    double max = arr1[0][0];
    int rMax = 0;
    int cMax = 0;
    int s = 0;
    int t = 0;
    int[] location = new int[2];
    
    //searches the array
    for (s = 0; s < arr1.length; s++) {
      for (t = 0; t < arr1[s].length; t++) {
        if (arr1[s][t] > max) {
          rMax = s;
          cMax = t;
        }
      }
    }
    
    location[0] = cMax;
    location[1] = rMax;
    System.out.println("The location of the largest element is at (" + location[0] + ", " + location[1] + ")");
    return location;
  }
}