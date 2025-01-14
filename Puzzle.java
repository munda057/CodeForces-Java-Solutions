import java.util.Arrays;
import java.util.Scanner;

public class Puzzle {
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    int m = scanner.nextInt();
    int[] arr = new int[m];
    for (int i = 0; i < arr.length; i++){
      arr[i] = scanner.nextInt();
    }

    Arrays.sort(arr);

    int min = arr[n - 1] - arr[0];
    for (int i = 1; i < arr.length - n + 1; i++){
      if (min > arr[n + i - 1] - arr[i]){
        min = arr[n + i - 1] - arr[i];
      }
    }
    System.out.println(min);
  }
}
