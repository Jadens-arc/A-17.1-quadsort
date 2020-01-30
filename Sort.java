import java.util.*;
import java.io.*;

class Sort {
  public ArrayList<Double> doubles = new ArrayList<Double>();
  
  public Sort(String filename){
    try{
      File myFile = new File(filename);
      Scanner fileScanner = new Scanner(myFile);
    
      while(fileScanner.hasNextDouble()){
        doubles.add(fileScanner.nextDouble());
      }
    }
    catch(Exception e){
      System.out.println("file path not accurate");
    }


  }

  public double[] bubbleSort(){
    BubbleSort myBS = new BubbleSort();
    return myBS.sort(doubles);
  }

  public ArrayList<Double> selectionSort(){
    SelectionSort mySS = new SelectionSort();
    return mySS.sort(doubles);
  }

  public ArrayList<Double> insertionSort(){
    InsertionSort myIS = new InsertionSort();
    return myIS.sort(doubles);
  }

  public ArrayList<Double> mergeSort(){
    MergeSort myMS = new MergeSort();
    return myMS.sort(doubles);
  }

}