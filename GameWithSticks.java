import java.util.Scanner;

public class GameWithSticks {
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    int m = scanner.nextInt();
    int win = Math.min(n, m);
    if (win % 2 == 1){
      System.out.println("Akshat");
    }
    else {
      System.out.println("Malvika");
    }
  }
}
