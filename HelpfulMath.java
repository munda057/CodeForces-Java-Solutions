import java.util.Arrays;
import java.util.Scanner;

public class HelpfulMath {
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    String[] arr = scanner.nextLine().split("");
    int[] arrOfNums = new int[arr.length / 2 + 1];
    int k = 0;
    for(int i = 0; i < arr.length; i+=2){
      arrOfNums[k] = Integer.parseInt(arr[i]);
      k++;
    }
    sortingAlgo(arrOfNums);
    String result = "";
    for(int i = 0; i < arrOfNums.length; i++){
      if (i != arrOfNums.length - 1){
        result += arrOfNums[i] + "+";
      }
      else {
        result += arrOfNums[i];
      }
    }
    System.out.println(result);
  }

  public static void sortingAlgo(int[] arrOfNums){
    for(int i = 0; i < arrOfNums.length; i++){
      int curr = arrOfNums[i];
      int j = i - 1;
      while (j >= 0 && arrOfNums[j] > curr){
        arrOfNums[j+1] = arrOfNums[j];
        j--;
      }
      arrOfNums[j + 1] = curr;
    }
  }
}
