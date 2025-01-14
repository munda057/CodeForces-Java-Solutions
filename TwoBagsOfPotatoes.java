import java.util.Scanner;

public class TwoBagsOfPotatoes {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    long secondPack = scanner.nextLong(); // y
    long divisibleCheck = scanner.nextLong(); // k
    long notGreater = scanner.nextLong(); // n

    long firstPossibleX = ((secondPack + divisibleCheck - 1) / divisibleCheck) * divisibleCheck - secondPack;

    if (firstPossibleX < 1) {
      firstPossibleX += divisibleCheck;
    }

    if (firstPossibleX + secondPack > notGreater) {
      System.out.println(-1);
      return;
    }

    StringBuilder result = new StringBuilder();
    for (long x = firstPossibleX; x + secondPack <= notGreater; x += divisibleCheck) {
      result.append(x).append(" ");
    }

    // Print the result
    System.out.println(result.toString().trim());
  }
}
