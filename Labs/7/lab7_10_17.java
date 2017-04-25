//Mike Pepsin
//CMPT220
//Lab 7
//4/27/17
import java.lang.Math;
public class lab7_10_17 {
  public static void main(String[] args) {
    double proxy = Long.MAX_VALUE; // Long.MAX_VALUE = (2^63)-1
    System.out.println(proxy);
    proxy = (Math.pow(proxy,.5)); //finds the sqrt of Long.MAX_VALUE
    proxy = ((int) proxy) + 1; //shorts the decimal, then adds 1
    //proxy is now a whole number equal to the square root of Long.MAX_VALUE, rounded up
    //proxy * proxy is now the first square number larger than Long.MAX_VALUE
    double[] larger = new double[10];
    for (int w=0; w<10; w++) {
      larger[w] = Math.pow(proxy, 2);
      proxy++; 
    }
    //stores the first 10 square numbers larger than Long.MAX_VALUE in larger[] 
  }
}