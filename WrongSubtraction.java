import java.util.Scanner;

public class WrongSubtraction {
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    long n = scanner.nextInt();
    int k = scanner.nextInt();
    while (k > 0){
      if (n % 10 != 0){
        n--;
      }
      else {
        n /= 10;
      }
      k--;
    }
    System.out.println(n);
  }
}
