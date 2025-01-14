import java.time.temporal.ValueRange;
import java.util.Arrays;
import java.util.Scanner;

public class SortTheArray {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    int[] arr = new int[n];
    for (int i = 0; i < n; i++) {
      arr[i] = scanner.nextInt();
    }

    int l = 0;
    int r = 0;
    for (int i = 0; i < arr.length - 1; i++){
      if (arr[i] > arr[i+1]){
        l = i;
        break;
      }
    }

    for (int i = arr.length - 1; i > 0; i--) {
      if (arr[i] < arr[i - 1]) {
        r = i;
        break;
      }
    }

    if (r - l == 1){
      int temp = arr[l];
      arr[l] = arr[r];
      arr[r] = temp;
    }
    else {
      for (int i = l; i <= (l + r) / 2; i++) {
        int temp = arr[i];
        arr[i] = arr[r - (i - l)];
        arr[r - (i - l)] = temp;
      }
    }

    boolean check = false;
    for (int i = 0; i < arr.length - 1; i++){
      if (arr[i] > arr[i+1]){
        System.out.println("no");
        check = true;
        break;
      }
    }

    if (!check){
      System.out.println("yes");
      System.out.print((l+1) + " " + (r+1));
    }
  }
}
