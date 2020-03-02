import java.util.*;
class MergeSort{
  public ArrayList<Double> merge(ArrayList<Double> left, ArrayList<Double> right){
    ArrayList<Double> result = new ArrayList<Double>();
    int i = 0;
    int j = 0;

    while(i < userArr.size() && j < userArr.size()){
      if(left.get(i) <= right.get(j)){
        result.add(left.get(i));
        i ++;
      }
      else{
        result.add(right.get(j));
        j ++;
      }
    }
    ArrayList<Double> newRight = right.subList(j, right.size() - 1);
    ArrayList<Double> newLeft = left.subList(i, right.size() - 1);

    result.addAll(newLeft);
    result.addAll(newRight);

    return result;
  }

  public ArrayList<Double> sort(ArrayList<Double> userArr){
    if(userArr.size() <= 1){
      return userArr;
    }

    int mid = (int) userArr.size() / 2;
    ArrayList<Double> left = MergeSort(userArr.subList(0, mid));
    ArrayList<Double> right = MergeSort(userArr.subList(mid, userArr.size() - 1));
    System.out.println(left.toString());
    System.out.println(right.toString());
    return merge(left, right);
  }
}