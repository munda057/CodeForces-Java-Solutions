import java.util.*;

public class SupernaturalPoint {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    int[][] points = new int[n][2];

    for (int i = 0; i < n; i++) {
      points[i][0] = scanner.nextInt(); // x-coordinate
      points[i][1] = scanner.nextInt(); // y-coordinate
    }

    int supercentralCount = 0;
    for (int i = 0; i < n; i++) {
      int x = points[i][0];
      int y = points[i][1];

      boolean hasLeft = false;
      boolean hasRight = false;
      boolean hasAbove = false;
      boolean hasBelow = false;

      for (int j = 0; j < n; j++) {
        if (i == j) continue;

        int xOther = points[j][0];
        int yOther = points[j][1];

        if (xOther < x && yOther == y) {
          hasLeft = true;
        }
        if (xOther > x && yOther == y) {
          hasRight = true;
        }
        if (xOther == x && yOther > y) {
          hasAbove = true;
        }
        if (xOther == x && yOther < y) {
          hasBelow = true;
        }
      }
      if (hasLeft && hasRight && hasAbove && hasBelow) {
        supercentralCount++;
      }
    }

    System.out.println(supercentralCount);
  }
}
