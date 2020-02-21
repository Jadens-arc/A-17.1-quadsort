import java.util.*;
class MergeSort{
  public ArrayList<Double> sort(ArrayList<Double> userArr){
    if(userArr.size() == 1){
      return userArr;
    }

    int middle = userArr.size() / 2;

    ArrayList<Double> leftArr = new ArrayList<Double>();
    ArrayList<Double> rightArr = new ArrayList<Double>();

    for(int i = 0; i < middle; i ++){
      leftArr.add(userArr.get(i));
    }

    for(int i = middle; i < userArr.size(); i ++){
      rightArr.add(userArr.get(i));
    }

    

    ArrayList<Double> left = sort(leftArr);
    ArrayList<Double> right = sort(rightArr);
    ArrayList<Double> result = merge(left, right);
    return result;
  }

  public ArrayList<Double> merge(ArrayList<Double> left, ArrayList<Double> right){
    ArrayList<Double> result = new ArrayList<Double>();

    int lP = rP = reP = 0;
    
    while(lP < left.size() || rP < right.size()){
      if(lP < left.size() && rP < right.size()){
        if (left.get(lP) < right.get(rP)){
          result.set(reP++, left.get(lP));

        }
        else{
          result.set(reP++, right.get(rP++));
        }
      }
      else if(lP < left.size()){
        result.set(reP++, left.get(lP++));
      }
      else if(rP < right.size()){
        result.set(reP, right.get(rP));
      }
    }

    return result;
  }
}