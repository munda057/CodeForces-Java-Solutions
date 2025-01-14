import java.util.IllegalFormatCodePointException;
import java.util.Scanner;

public class PetyaAndCountrySide {
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    int[] arr = new int[n];
    for (int i = 0; i < arr.length; i++){
      arr[i] = scanner.nextInt();
    }

    int count = 0;
    int max = Integer.MIN_VALUE;
    for (int i = 0; i < n; i++){
      count = 1;
      for (int j = i - 1; j >= 0; j--){
        if (arr[j] <= arr[j + 1]){
          count++;
        }
        else {
          break;
        }
      }

      for (int k = i + 1; k < n; k++){
        if (arr[k] <= arr[k - 1]){
          count++;
        }
        else {
          break;
        }
      }

      max = Math.max(max, count);
    }
    System.out.println(max);
  }
}
