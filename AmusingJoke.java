import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class AmusingJoke {
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    String[] wordOne = scanner.nextLine().split("");
    String[] wordTwo = scanner.nextLine().split("");
    String[] concat = new String[wordOne.length + wordTwo.length];
    int finalIndex = 0;
    for(int i = 0; i < wordOne.length; i++){
      concat[i] = wordOne[i];
      finalIndex = i;
    }
    for(int i = 0; i < wordTwo.length; i++){
      concat[finalIndex + 1 + i] = wordTwo[i];
    }
    String[] finalWord = scanner.nextLine().split("");
    if (finalWord.length != concat.length){
      System.out.println("NO");
    }
    else {
      sortingAlgo(finalWord);
      sortingAlgo(concat);
      if (Arrays.equals(finalWord, concat)){
        System.out.println("YES");
      }
      else {
        System.out.println("NO");
      }
    }
  }

  public static void sortingAlgo(String[] arr) {
    for (int i = 1; i < arr.length; i++) {
      String key = arr[i];
      int j = i - 1;
      while (j >= 0 && arr[j].compareTo(key) > 0) {
        arr[j + 1] = arr[j];
        j--;
      }
      arr[j + 1] = key;
    }
  }
}
