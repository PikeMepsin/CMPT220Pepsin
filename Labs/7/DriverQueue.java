//Driver for problem 10
public class DriverQueue {
  public static void main(String[] ags) {
    Queue s = new Queue();
    for (int j=0;j<20;j++) {
      s.enqueue(j+1);
      if (j>=7) {
        s.dequeue();
      }
    }
    
  }
}