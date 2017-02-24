/*
  Mike Pepsin
  2/23/17
  Lab3
  5.7
*/
public class lab3_5_7 {
  public static void main(String[] args) {
	int tuit = 10000;
	double increase = 1.05;
	int fourYear = 0;
	
	for (int j=0;j<10;j++) {
	  tuit *= increase;
	}
	System.out.println("The tuition after 10 years will be $" + tuit);
	
	fourYear = tuit;
	for (int i=0;i<3;i++) {
	  tuit *= increase;
	  fourYear += tuit;
	}
	System.out.println("10 years from now, four years of college will be $" + fourYear);
	
  }
}