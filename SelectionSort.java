import java.util.*;
class SelectionSort{
  public ArrayList<Double> sort(ArrayList<Double> userArr)
  {
    ArrayList<Double> sorted = new ArrayList<Double>();
    int userLength = userArr.size();
    while(sorted.size() != userLength)
    {
      for(int i = 0; i < userArr.size(); i ++)
      {
        double smallest = userArr.get(i);
        int smallestIndex = 0;
        for(int j = 0; j < userArr.size(); j ++)
        {
          double newSmallest = userArr.get(j);
          if(newSmallest <= smallest)
          {
            smallest = newSmallest;
            smallestIndex = userArr.indexOf(smallest);
          }
        }
        userArr.remove(smallestIndex);
        sorted.add(smallest);
      }
     
    }
    return sorted;
  }
  
}