import java.util.*;

public class Reconnaissance2 {
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    int numOfTests = Integer.parseInt(scanner.nextLine());
    String[] soldiers = scanner.nextLine().split(" ");
    int[] soldiersNum = new int[soldiers.length];
    for(int i = 0; i < numOfTests; i++){
      soldiersNum[i] = Integer.parseInt(soldiers[i]);
    }
    int[] result = minDifferenceIndex(soldiersNum);
    for(int i = 0; i < result.length; i++){
      System.out.print(result[i] + " ");
    }
  }

  public static int[] minDifferenceIndex(int[] arr){
    int indexOne = 0;
    int indexTwo = 0;
    int min = Integer.MAX_VALUE;
    for(int i = 0; i < arr.length - 1; i++){
      if (Math.abs(arr[i] - arr[i+1]) < min){
        min = Math.abs(arr[i] - arr[i+1]);
        indexOne = i;
        indexTwo = i + 1;
      }
    }

    if (Math.abs(arr[0] - arr[arr.length - 1]) < min){
      min = Math.abs(arr[0] - arr[arr.length - 1]);
      indexOne = 0;
      indexTwo = arr.length - 1;
    }

    int[] index = new int[2];
    index[0] = indexOne + 1;
    index[1] = indexTwo + 1;
    return index;
  }
}
