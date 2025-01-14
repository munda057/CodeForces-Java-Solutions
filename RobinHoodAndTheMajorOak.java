import java.util.Scanner;

public class RobinHoodAndTheMajorOak {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int tests = scanner.nextInt();

    while (tests-- > 0) {
      int n = scanner.nextInt();
      int k = scanner.nextInt();

      int start = n - k + 1;
      int end = n;

      int oddCount = (end + 1) / 2 - (start / 2);

      if (oddCount % 2 == 0) {
        System.out.println("YES");
      } else {
        System.out.println("NO");
      }
    }
    scanner.close();
  }
}
