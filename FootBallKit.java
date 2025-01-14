import java.util.HashMap;
import java.util.Scanner;

public class FootBallKit {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n = Integer.parseInt(scanner.nextLine());
    int[][] kits = new int[n][2];

    HashMap<Integer, Integer> homeCount = new HashMap<>();
    HashMap<Integer, Integer> awayCount = new HashMap<>();

    for (int i = 0; i < n; i++) {
      kits[i][0] = scanner.nextInt();
      kits[i][1] = scanner.nextInt();

      homeCount.put(kits[i][0], homeCount.getOrDefault(kits[i][0], 0) + 1);
      awayCount.put(kits[i][1], awayCount.getOrDefault(kits[i][1], 0) + 1);
    }

    for (int i = 0; i < n; i++) {
      int homeColor = kits[i][0];
      int awayColor = kits[i][1];
      int homeGames = (n - 1) + homeCount.getOrDefault(awayColor, 0);
      int awayGames = (n - 1) - homeCount.getOrDefault(awayColor, 0);
      System.out.println(homeGames + " " + awayGames);
    }
  }
}
