import java.util.Scanner;

public class Fence {
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    int k = scanner.nextInt();
    int[] arr = new int[n];
    for (int i = 0; i < n; i++){
      arr[i] = scanner.nextInt();
    }

    int windowSum = 0;
    int index = k - 1;

    for (int i = 0; i < k; i++){
      windowSum += arr[i];
    }

    int min = windowSum;

    for (int i = k; i < arr.length; i++){
      windowSum += arr[i] - arr[i - k];
      if (windowSum < min){
        min = windowSum;
        index = i;
      }
    }

    System.out.println(index - k + 2);
  }
}
