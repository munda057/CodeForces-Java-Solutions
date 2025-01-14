import javax.swing.*;
import java.util.Scanner;

public class Airport{
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    String[] logs = scanner.nextLine().split(" ");
    int numOfPassengers = Integer.parseInt(logs[0]);
    int numOfPlanes = Integer.parseInt(logs[1]);

    String[] arr = scanner.nextLine().split(" ");
    int[] toPut = new int[arr.length];
    int[] getMinArr = new int[arr.length];
    for(int i = 0; i < arr.length; i++){
      toPut[i] = Integer.parseInt(arr[i]);
      getMinArr[i] = Integer.parseInt(arr[i]);
    }

    int countMax = 0;
    int countMin = 0;
    while(numOfPassengers > 0){
      int[] output = getMax(toPut);
      int max = output[0];
      int index = output[1];
      countMax += max;
      toPut[index]--;

      int[] minOutput = getMin(getMinArr);
      int min = minOutput[0];
      int indexMin = minOutput[1];
      countMin += min;
      getMinArr[indexMin]--;
      if (getMinArr[indexMin] == 0){
        getMinArr[indexMin] = Integer.MAX_VALUE;
      }
      numOfPassengers--;
    }
    System.out.println(countMax + " " + countMin);


  }

  public static int[] getMax(int[] arr){
    int max = Integer.MIN_VALUE;
    int index = 0;
    for(int i = 0; i < arr.length; i++){
      if(arr[i] > max){
        max = arr[i];
        index = i;
      }
    }
    return new int[] {max, index};
  }

  public static int[] getMin(int[] arr){
    int min = Integer.MAX_VALUE;
    int index = 0;
    for(int i = 0; i < arr.length; i++){
      if(min > arr[i]) {
        min = arr[i];
        index = i;
      }
    }
    return new int[] {min, index};
  }
}