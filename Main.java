import java.util.*;

class Main {
  public static void main(String[] args) {
    Sort mySort = new Sort("nums.txt");
    double[] sorted = mySort.bubbleSort();
    System.out.println(Arrays.toString(sorted));
  }
}