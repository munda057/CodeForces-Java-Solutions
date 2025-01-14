import java.util.Scanner;

public class HardProblem {
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    int tests = Integer.parseInt(scanner.nextLine());
    while (tests > 0){
      String[] arr = scanner.nextLine().split(" ");
      int m = Integer.parseInt(arr[0]);
      int a = Integer.parseInt(arr[1]);
      int b = Integer.parseInt(arr[2]);
      int c = Integer.parseInt(arr[3]);

      int total = 0;
      if (a > m){
        total += m;
      }
      else {
        total += a;
        if (m - a > c){
          total += c;
          c = 0;
        }
        else {
          total += (m - a);
          c -= (m - a);
        }
      }
      if (b > m){
        total += m;
      }
      else {
        total += b;
        if (m - b > c) {
          total += c;
        }
        else {
          total += (m - b);
        }
      }
      System.out.println(total);
      tests--;
    }
  }
}
