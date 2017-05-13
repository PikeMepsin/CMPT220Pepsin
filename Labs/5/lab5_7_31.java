//Mike Pepsin
//Lab 5
//7.31
//3/30/17 Spring
import java.util.Scanner;
import java.util.Arrays;
public class lab5_7_31 {
  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);
    System.out.println("Enter list 1:");
    int length1 = keyboard.nextInt();
    int[] arr1 = new int[length1];
    for (int i=0; i<length1; i++) {
      arr1[i] = keyboard.nextInt();
    }
    System.out.println("Enter list 2:");
    int length2 = keyboard.nextInt();
    int[] arr2 = new int[length2];
    for (int j=0; j<length2; j++) {
      arr2[j] = keyboard.nextInt();
    }
    
    merge(arr1, arr2);
  }
  
  public static void merge(int[] list1, int[] list2) {
    int masterLength = list1.length + list2.length;
    int[] masterList = new int[masterLength];
    for (int q=0; q<list1.length; q++) {
      masterList[q] = list1[q];
    }
    for (int w=list1.length; w<masterLength; w++) {
      masterList[w] = list2[w-list1.length];
    }
    
    Arrays.sort(masterList);
    
    System.out.println();
    for (int t=0; t<masterLength; t++) {
      System.out.println(masterList[t]);
    }
  }  
}