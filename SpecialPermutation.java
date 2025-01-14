import java.util.Scanner;

public class SpecialPermutation {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int t = scanner.nextInt(); // Number of test cases

    while (t-- > 0) {
      int n = scanner.nextInt();
      if (n == 2) {
        System.out.println(-1); // Not possible for n = 2
      } else {
        // Create the permutation
        StringBuilder result = new StringBuilder();
        // Odd numbers first (descending)
        for (int i = n; i > 0; i -= 2) {
          result.append(i).append(" ");
        }
        // Even numbers next (descending)
        for (int i = n - 1; i > 0; i -= 2) {
          result.append(i).append(" ");
        }
        System.out.println(result.toString().trim());
      }
    }

    scanner.close();
  }
}
