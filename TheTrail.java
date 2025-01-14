import java.util.Scanner;

public class TheTrail {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int T = scanner.nextInt();
    while (T-- > 0) {
      int N = scanner.nextInt();
      int M = scanner.nextInt();
      String S = scanner.next();

      long[][] grid = new long[N][M];
      for (int i = 0; i < N; i++) {
        for (int j = 0; j < M; j++) {
          grid[i][j] = scanner.nextLong();
        }
      }

      long totalSum = 0;
      for (int i = 0; i < N; i++) {
        for (int j = 0; j < M; j++) {
          totalSum += grid[i][j];
        }
      }

      int x = 0, y = 0;
      for (char c : S.toCharArray()) {
        if (c == 'D') {
          long rowSum = 0;
          for (int j = 0; j < M; j++) {
            rowSum += grid[x][j];
          }
          grid[x][y] = -rowSum;
          totalSum -= rowSum;
          x++;
        } else if (c == 'R') {
          long colSum = 0;
          for (int i = 0; i < N; i++) {
            colSum += grid[i][y];
          }
          grid[x][y] = -colSum;
          totalSum -= colSum;
          y++;
        }
      }

      grid[x][y] = -totalSum;

      for (int i = 0; i < N; i++) {
        for (int j = 0; j < M; j++) {
          System.out.print(grid[i][j] + " ");
        }
        System.out.println();
      }
    }
  }
}
