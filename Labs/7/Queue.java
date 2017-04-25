//Mike Pepsin
//CMPT220
//Lab 7, exercise 10
public class Queue {
  private int[] elements;
  private int capacity = 0;
  private int size = 0;
  
  Queue() {
    capacity = 8;
    elements = new int[size];
  }
    
    
    int getTop() {
      int idx = getSize() - 1;
      if (idx > 0) {
        return elements[idx];
      }
      else {
        return -1;
      }
    }
    
    void enqueue(int v) { //puts on top
      int idx = getSize();
      elements[idx] = v;
      setSize(idx + 1);
    }
    
    int dequeue() { //remove from queue
      int idx = getSize();
      int value = elements[0]; //stores the element being removed
      for (int i = 0; i <= idx; i++) {
        elements[i] = elements[i+1];
      }
      setSize(idx - 1);
      return value;
    }
    
    int getCapacity() {
      return capacity;
    }
    
    void setCapacity(int c) {
      capacity = c;
    }
    
    int getSize() {
      return size;
    }
    
    void setSize(int s) {
      size = s;
    }
    
    boolean empty() {
      boolean empty = false;
      if (getSize() == 0) {
        empty = true;
      }
      return empty;
    }
    
    
    
}

