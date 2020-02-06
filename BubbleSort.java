import java.util.*;


class BubbleSort {
  public ArrayList<Double> sort(ArrayList<Double> userArr){
    for(int i = 0; i < userArr.size(); i ++){
      for(int j = 1; j < userArr.size() - i; j ++){
        if(userArr.get(j - 1) > userArr.get(j)){
          double old  = userArr.get(j - 1);
          userArr.set(j - 1, userArr.get(j));
          userArr.set(j, old);
        }// ends swap
      }// ends j for loop
    }// ends i for loop
    return userArr;
  }// ends sort method
}// ends BubbleSort class