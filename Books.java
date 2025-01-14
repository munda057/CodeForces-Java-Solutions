import java.util.Scanner;

public class Books {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    long t = scanner.nextLong();
    int[] arr = new int[n];
    for (int i = 0; i < n; i++) {
      arr[i] = scanner.nextInt();
    }

    int start = 0;
    long currentSum = 0;
    int maxBooks = 0;

    for (int end = 0; end < n; end++) {
      currentSum += arr[end];
      while (currentSum > t) {
        currentSum -= arr[start];
        start++;
      }
      maxBooks = Math.max(maxBooks, end - start + 1);
    }
    System.out.println(maxBooks);
  }
}
