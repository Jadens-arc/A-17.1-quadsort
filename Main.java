import java.util.*;

class Main {
  public static void main(String[] args) {
    Sort mySort = new Sort("nums.txt");
    System.out.println("Old: " + mySort.getUnSorted());
    ArrayList<Double> sorted = mySort.selectionSort();
    System.out.println("New: " + sorted.toString());
  }
}