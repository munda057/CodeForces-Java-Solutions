import java.util.Scanner;

public class CoinTransformation {
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    int tests = scanner.nextInt();
    int count = 1;
    while (tests > 0){
      count = 1;
      long n = scanner.nextLong();
      while (n > 3){
        n = n / 4;
        count *= 2;
      }
      System.out.println(count);
      tests--;
    }
  }
}
