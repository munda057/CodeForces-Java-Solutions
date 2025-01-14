import java.util.HashSet;
import java.util.Scanner;

public class Twice {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int tests = scanner.nextInt();
    while (tests > 0) {
      int n = scanner.nextInt();
      int[] presents = new int[n];
      for (int i = 0; i < n; i++) {
        presents[i] = scanner.nextInt();
      }
      HashSet<Integer> usedIndices = new HashSet<>();
      int count = 0;

      for (int i = 0; i < n; i++) {
        if (usedIndices.contains(i)) {
          continue;
        }
        for (int j = i + 1; j < n; j++) {
          if (!usedIndices.contains(j) && presents[i] == presents[j]) {
            usedIndices.add(i);
            usedIndices.add(j);
            count++;
            break;
          }
        }
      }
      System.out.println(count);
      tests--;
    }
  }
}
