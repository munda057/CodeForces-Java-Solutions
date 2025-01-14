import java.io.FilterOutputStream;
import java.security.Key;
import java.util.Arrays;
import java.util.Scanner;

public class GreedyMonocarp {
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    int tests = Integer.parseInt(scanner.nextLine());
    while (tests > 0){
      String[] arr = scanner.nextLine().split(" ");
      int n = Integer.parseInt(arr[0]);
      int k = Integer.parseInt(arr[1]);

      int[] toSort = new int[n];
      String[] chests = scanner.nextLine().split(" ");

      for(int i = 0; i < toSort.length; i++){
        toSort[i] = Integer.parseInt(chests[i]);
      }

      Arrays.sort(toSort);

      int sum = 0;
      int res = 0;
      for(int i = toSort.length - 1; i >= 0; i--){
        sum += toSort[i];
        if (sum > k){
          int j = sum - k;
          res = toSort[i] - j;
          break;
        }
        else if (sum == k){
          break;
        }
      }
      if (sum < k){
        System.out.println(k - sum);
      }
      else {
        System.out.println(res);
      }
      tests--;
    }
  }
}
