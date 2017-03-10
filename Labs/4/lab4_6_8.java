//Mike Pepsin
//Lab 4
//3/9/17
import java.lang.Math;
public class lab4_6_8 {
  public static void main(String[] args) {
	System.out.println("Celsius \tFahrenheit\t|\tFahrenheit \tCelsius");
	System.out.println("________________________________|_______________________________");
	System.out.println("40\t\t" + celsiusToFahrenheit(40) + "\t\t|\t120\t\t" + fahrenheitToCelsius(120));
	System.out.println("39\t\t" + celsiusToFahrenheit(39) + "\t\t|\t110\t\t" + fahrenheitToCelsius(110));
	System.out.println("38\t\t" + celsiusToFahrenheit(38) + "\t\t|\t100\t\t" + fahrenheitToCelsius(100));
	System.out.println("37\t\t" + celsiusToFahrenheit(37) + "\t\t|\t90\t\t" + fahrenheitToCelsius(90));
	System.out.println("36\t\t" + celsiusToFahrenheit(36) + "\t\t|\t80\t\t" + fahrenheitToCelsius(80));
	System.out.println("35\t\t" + celsiusToFahrenheit(35) + "\t\t|\t70\t\t" + fahrenheitToCelsius(70));
	System.out.println("34\t\t" + celsiusToFahrenheit(34) + "\t\t|\t60\t\t" + fahrenheitToCelsius(60));
	System.out.println("33\t\t" + celsiusToFahrenheit(33) + "\t\t|\t50\t\t" + fahrenheitToCelsius(50));
	System.out.println("32\t\t" + celsiusToFahrenheit(32) + "\t\t|\t40\t\t" + fahrenheitToCelsius(40));
	System.out.println("31\t\t" + celsiusToFahrenheit(31) + "\t\t|\t30\t\t" + fahrenheitToCelsius(30));
  }
  
  //converts celsius to fahrenheit
  public static double celsiusToFahrenheit(double celsius) {
	  double proxyF = ((9 * celsius) / 5) + 32;
	  proxyF *= 100;
	  proxyF = Math.round(proxyF);
	  proxyF /= 100;
	return proxyF;
  }
  
  //converts fahrenheit to celsius
  public static double fahrenheitToCelsius(double fahrenheit) {
	  double proxyC = (5 * (fahrenheit - 32)) / 9;
	  proxyC *= 100;
	  proxyC = Math.round(proxyC);
	  proxyC /= 100;
	return proxyC;
  }
}