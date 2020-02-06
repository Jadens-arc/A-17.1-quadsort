import java.util.*;
class MergeSort{
  public ArrayList<Double> sort(ArrayList<Double> userArr){
    ArrayList<Double> a = new ArrayList<Double>();
    ArrayList<Double> b = new ArrayList<Double>();
    
    for (double item: userArr){
      a.add(item);
    }

    while (a.size() > 1){
      b.add(a.get(a.size() - 1));
      a.remove(a.size() - 1);
    }
    return a;
  }
}