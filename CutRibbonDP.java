import java.util.Scanner;

public class CutRibbonDP {
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    int x = scanner.nextInt();
    int y = scanner.nextInt();
    int z = scanner.nextInt();

    int[] dp = new int[n + 1];
    for (int i = 0; i <= n; i++){
      dp[i] = Integer.MIN_VALUE;
    }
    dp[0] = 0;

    for (int i = 0; i <= n ; i++){
      if (i >= x){
        dp[i] = Math.max(dp[i], dp[i - x] + 1);
      }
      if (i >= y){
        dp[i] = Math.max(dp[i], dp[i - y] + 1);
      }
      if (i >= z){
        dp[i] = Math.max(dp[i], dp[i - z] + 1);
      }
    }

    System.out.println(dp[n]);
  }
}
