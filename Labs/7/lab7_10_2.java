//Mike Pepsin
//CMPT220L
//4/27/17
//Lab 7
import java.util.Scanner;
public class lab7_10_2 {

static Scanner keyboard = new Scanner(System.in);  
  
  public static void BMI(String name, int age, double weight, double feet, double inches) {
    System.out.println("Name and age: " + name + " " + age);
    System.out.println("Height in feed/inches: " + feet + "'" + inches + "\"");
    System.out.println("Weight in pounds: " + weight);
    double heightInches = (feet * 12) + inches;
    System.out.println("BMI is: " + ((weight * .45) / ((heightInches * .025) * (heightInches * .025))));    
  }
  
  public static void main(String[] args) {
    System.out.println("Enter your name: ");
    String newName = keyboard.nextLine();
    System.out.println("Enter your age: ");
    int newAge = keyboard.nextInt();
    System.out.println("Enter your height in feet, then inches: ");
    double heightF = keyboard.nextDouble();
    double heightI = keyboard.nextDouble();
    System.out.println("Enter your weight in pounds: ");
    double newWeight = keyboard.nextDouble();
    
    BMI(newName, newAge, newWeight, heightF, heightI); 
  }
}