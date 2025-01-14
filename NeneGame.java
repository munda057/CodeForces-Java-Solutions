import java.util.Scanner;

public class NeneGame {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int tests = scanner.nextInt();
    while (tests > 0) {
      int n = scanner.nextInt();
      int m = scanner.nextInt();
      int[] arr = new int[n];
      int[] remember = new int[m];
      int[] nums = new int[m];
      int min = Integer.MAX_VALUE;

      for (int i = 0; i < n; i++) {
        arr[i] = scanner.nextInt();
        if (arr[i] < min) {
          min = arr[i];
        }
      }

      for (int i = 0; i < m; i++) {
        nums[i] = scanner.nextInt();
        remember[i] = nums[i];
      }

      int[] answer = new int[m];
      for (int i = 0; i < nums.length; i++) {
        int players = nums[i];
        boolean eliminated = true;

        while (eliminated) {
          eliminated = false;
          int remaining = 0;
          for (int j = 0; j < n; j++) {
            if (arr[j] <= players) {
              remaining++;
              players--;
              eliminated = true;
            }
          }
        }

        answer[i] = players;
      }

      for (int i = 0; i < answer.length; i++) {
        System.out.print(answer[i] + " ");
      }
      System.out.println();
      tests--;
    }
  }
}
