import java.util.Scanner;

public class Journey {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int t = scanner.nextInt();

    for (int i = 0; i < t; i++) {
      long n = scanner.nextLong();
      long a = scanner.nextLong();
      long b = scanner.nextLong();
      long c = scanner.nextLong();

      long cycleDistance = a + b + c;
      long numFullCycles = n / cycleDistance;
      long remainingDistance = n % cycleDistance;

      long totalDays = numFullCycles * 3;

      if (remainingDistance > 0) {
        if (remainingDistance <= a) {
          totalDays += 1;
        } else if (remainingDistance <= a + b) {
          totalDays += 2;
        } else {
          totalDays += 3;
        }
      } else {
        if (n % cycleDistance == 0) {
          if (n % cycleDistance == c) {
            totalDays += 3;
          }
        }
      }

      System.out.println(totalDays);
    }
  }
}
