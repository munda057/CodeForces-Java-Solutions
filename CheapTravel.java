import java.util.Scanner;

public class CheapTravel {
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    int m = scanner.nextInt();
    int a = scanner.nextInt();
    int b = scanner.nextInt();

    int[] dp = new int[n + 1];
    dp[0] = 0;

    for (int i = 1; i <= n; i++){
      dp[i] = dp[i - 1] + a;
      if (i >= m){
        dp[i] = Math.min(dp[i], dp[i - m] + b);
      }
      else {
        dp[i] = Math.min(dp[i], b);
      }
    }
    System.out.println(dp[n]);
  }
}