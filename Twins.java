import java.util.Arrays;
import java.util.Scanner;

public class Twins {
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    int sum = 0;
    int[] arr = new int[n];
    for (int i = 0; i < n; i++){
      arr[i] = scanner.nextInt();
      sum += arr[i];
    }

    Arrays.sort(arr);

    for (int i = 0; i < arr.length / 2; i++){
      int temp = arr[i];
      arr[i] = arr[arr.length - 1 - i];
      arr[arr.length - 1 - i] = temp;
    }

    int total = 0;
    int count = 0;
    for (int i = 0; i < n; i++){
      if (total > sum/2){
        break;
      }
      else {
        count++;
        total+=arr[i];
      }
    }
    System.out.println(count);
  }
}
