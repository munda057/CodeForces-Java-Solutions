import java.util.Arrays;
import java.util.Scanner;

public class BuyingLemonade {
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    int tests = scanner.nextInt();
    while (tests > 0){
      int n = scanner.nextInt();
      int k = scanner.nextInt();
      int[] arr = new int[n];
      for (int i = 0; i < arr.length; i++){
        arr[i] = scanner.nextInt();
      }
      Arrays.sort(arr);
      int initial = 0;
      int count = 0;
      for (int i = 0; i < arr.length; i++){
        count += (arr[i] - initial) * n;
        initial = arr[i];
        if (count >= k){
          System.out.println(count);
          break;
        }
      }


      tests--;
    }
  }
}
