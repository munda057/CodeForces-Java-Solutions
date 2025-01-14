import java.util.Scanner;

public class JeffAndDigits {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    int count5 = 0, count0 = 0;

    for (int i = 0; i < n; i++) {
      int digit = scanner.nextInt();
      if (digit == 5) count5++;
      else count0++;
    }

    if (count0 == 0) {
      System.out.println(-1);
    } else if (count5 < 9) {
      System.out.println(0);
    } else {
      StringBuilder sb = new StringBuilder();
      for (int i = 0; i < count5 / 9 * 9; i++) {
        sb.append(5);
      }
      for (int i = 0; i < count0; i++) {
        sb.append(0);
      }
      System.out.println(sb.toString());
    }
  }
}