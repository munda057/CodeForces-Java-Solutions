import java.util.Scanner;

public class CollectingBeatsIsFun {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int times = scanner.nextInt();
    scanner.nextLine();

    int[] counts = new int[10];

    for (int i = 0; i < 4; i++) {
      String line = scanner.nextLine();
      for (char c : line.toCharArray()) {
        if (Character.isDigit(c)) {
          counts[c - '0']++;
        }
      }
    }

    boolean isValid = true;
    for (int i = 1; i <= 9; i++) {
      if ((double) counts[i] / (2 * times) > 1.0) {
        isValid = false;
        break;
      }
    }

    System.out.println(isValid ? "YES" : "NO");
  }
}
