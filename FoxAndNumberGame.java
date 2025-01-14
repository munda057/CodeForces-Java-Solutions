import java.util.Arrays;
import java.util.Scanner;

public class FoxAndNumberGame {
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    int[] arr = new int[n];
    for (int i = 0; i < arr.length; i++){
      arr[i] = scanner.nextInt();
    }

    Arrays.sort(arr);
    int min = Integer.MAX_VALUE;
    for (int i = 0; i < arr.length - 1; i++){
      if (arr[i + 1] - arr[i] < min && arr[i+1] != arr[i]){
        min = arr[i + 1] - arr[i];
      }
    }


    if (min == 99){
      System.out.println(2);
    }
    else {
      if (min == Integer.MAX_VALUE){
        int sum = 0;
        for (int i = 0; i < arr.length; i++){
          sum += arr[i];
        }
        System.out.println(sum);
      }
      else {
        System.out.println(min * arr.length);
      }
    }
  }
}