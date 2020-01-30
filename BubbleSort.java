import java.util.*;

class BubbleSort {
  public BubbleSort() {

  }
  public ArrayList<Doul> sort(ArrayList<Double> userArr){
    double[] workingArr = {3.0, 1.0, 2.0};

    for(int i = 0; i < workingArr.length; i ++){
      for(int j = 1; j < workingArr.length - i; j ++){
        if(workingArr[j - 1] > workingArr[j]){
          // if the second one is less than the first one swap
          double old  = workingArr[j - 1];
          workingArr[j - 1] =  workingArr[j];
          workingArr[j] = old;

        }
      }
    }
    return workingArr;
  }
}