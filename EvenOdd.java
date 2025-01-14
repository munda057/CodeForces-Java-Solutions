import java.util.Scanner;

public class EvenOdd {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    long n = scanner.nextLong();
    long k = scanner.nextLong();

    if (k <= (n + 1) / 2) {
      System.out.println(2 * k - 1);
    } else {
      System.out.println(2 * (k - (n + 1) / 2));
    }
  }
}