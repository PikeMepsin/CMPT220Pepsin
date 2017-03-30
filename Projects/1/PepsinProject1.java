/*
Mike Pepsin
CMPT220, Thursday
Project 1
3/30/2017
*/
import java.util.Scanner;

public class PepsinProject1 {
  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);
  
    int firstLength = keyboard.nextInt();
    int secondLength = keyboard.nextInt();
    double[] vector1 = new double[firstLength];
    double[] vector2 = new double[secondLength];
    System.out.println();

    for (int i = 0; i<=firstLength-1; i++) {
      vector1[i] = keyboard.nextDouble();
      // used for testing input:  System.out.print(vector1[i] + " ");
    }
    for (int j = 0; j<=secondLength-1; j++) {
      vector2[j] = keyboard.nextDouble();
    }
    if (firstLength == 0 || secondLength == 0) {
      System.out.println("Vector size can not be 0.");
      System.exit(0);
    }

    double[] resultVec = convolveVectors(vector1, vector2);
    for (int k = 0; k<resultVec.length; k++) { //prints result vector
      System.out.print(Math.round(resultVec[k]) + " ");
    }
    
  }

  //Performs the convolution and returns the result vector
  public static double[] convolveVectors(double[] VectorF, double[] VectorS) {
    double[] vResult = new double[(VectorF.length + VectorS.length) - 1];
    //int placeHolder = 0;
    double insertRes = 0; //the number that will be saved into the result vector
  
    for (int e = 0; e<vResult.length; e++) {
        insertRes = 0;
        for (int w=0;w<VectorS.length;w++) {
          if ((e-w) > -1 && (e-w) < VectorF.length) {  
            insertRes+= (VectorF[e-w] * VectorS[w]);
          }
        }
      vResult[e] = insertRes;
    }
    return vResult;  
  }

}