//Mike Pepsin
//Lab 5
//7.32
//3/30/17 Spring
import java.util.Scanner;
public class lab5_7_32 {
  
  //Takes partition of list1 and returns as list2
  public static int partition(int[] list2) {
  	int first = 0;
  	int last = list2.length - 1;
    int pivot = list2[first]; // Choose the first element as the pivot
    int lowest = first + 1; // Index for forward search
    int highest = last; // Index for backward search

    while (highest > lowest) {
      // Search from the left
      while (lowest <= highest && list2[lowest] <= pivot) {
        lowest++;
      }
      // Search from the right
      while (lowest <= highest && list2[highest] > pivot) {
        highest--;
      }

      // Swap the two elements
      if (highest > lowest) {
        int temp = list2[highest];
        list2[highest] = list2[lowest];
        list2[lowest] = temp;
      }
    }

    while (highest > first && list2[highest] >= pivot) {
      highest--;
    }

    // Swap pivot with list2[highest]
    if (pivot > list2[highest]) {
      list2[first] = list2[highest];
      list2[highest] = pivot;
      return highest;
    }
    else {
      return first;
    }
  }
  
  public static void main (String[] args) {
    Scanner keyboard = new Scanner(System.in);

    // Enter values for list1
    System.out.print("Enter the list: ");
    int length = keyboard.nextInt();
    int[] list1 = new int[length];    
    for (int i = 0; i < list1.length; i++) {
      list1[i] = keyboard.nextInt();
    }
    partition(list1);
    
    System.out.print("After the partition, the list is ");
    for (int i = 0; i < list1.length; i++) {
      System.out.print(list1[i] + " ");
    }
  }
}