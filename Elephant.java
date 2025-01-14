import java.util.Scanner;

public class Elephant {
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    int x = 0;
    if (n % 5 != 0){
      x = n / 5;
      System.out.println(x + 1);
    }
    else {
      x = n / 5;
      System.out.println(x);
    }
  }
}
