import java.util.*;
class MergeSort{
  public MergeSort(){
    
  }
  public ArrayList<Double> split(ArrayList<Double> a, ArrayList<Double> b){
    if(a.size() > 1){
      
    }
    return a;


  }

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