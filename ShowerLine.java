import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ShowerLine {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    // Read the happiness matrix
    int[][] g = new int[5][5];
    for (int i = 0; i < 5; i++) {
      for (int j = 0; j < 5; j++) {
        g[i][j] = scanner.nextInt();
      }
    }

    // Generate all permutations of the lineup
    List<List<Integer>> permutations = new ArrayList<>();
    generatePermutations(new ArrayList<>(), new boolean[5], permutations);

    int maxHappiness = 0;

    // Calculate happiness for each permutation
    for (List<Integer> order : permutations) {
      maxHappiness = Math.max(maxHappiness, calculateHappiness(order, g));
    }

    // Output the maximum happiness
    System.out.println(maxHappiness);
  }

  // Generate all permutations of numbers 0 to 4
  private static void generatePermutations(List<Integer> current, boolean[] used, List<List<Integer>> permutations) {
    if (current.size() == 5) {
      permutations.add(new ArrayList<>(current));
      return;
    }
    for (int i = 0; i < 5; i++) {
      if (!used[i]) {
        used[i] = true;
        current.add(i);
        generatePermutations(current, used, permutations);
        current.remove(current.size() - 1);
        used[i] = false;
      }
    }
  }

  // Calculate the total happiness for a given lineup
  private static int calculateHappiness(List<Integer> order, int[][] g) {
    int totalHappiness = 0;

    // Simulate the process
    for (int i = 0; i < 5; i++) {
      // Students in the queue at the current stage
      List<Integer> queue = new ArrayList<>(order.subList(i, 5));

      // Pair students in the queue
      for (int j = 0; j < queue.size(); j += 2) {
        if (j + 1 < queue.size()) {
          int student1 = queue.get(j);
          int student2 = queue.get(j + 1);
          totalHappiness += g[student1][student2] + g[student2][student1];
        }
      }
    }

    return totalHappiness;
  }
}
