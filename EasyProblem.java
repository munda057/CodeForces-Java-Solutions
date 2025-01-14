import java.util.Scanner;

public class EasyProblem {
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    int tests = Integer.parseInt(scanner.nextLine());
    while (tests > 0){
      int n = scanner.nextInt();
      System.out.println(n-1);
      tests--;
    }
  }
}
