
import java.util.Scanner;

public class DontTryToCount {
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    int numTests = Integer.parseInt(scanner.nextLine());
    while (numTests > 0){
      int n = Integer.parseInt(scanner.next());
      int m = Integer.parseInt(scanner.next());
      StringBuilder x = new StringBuilder(scanner.next());
      String y = scanner.next();

      int count = 0;
      boolean check = false;
      while (!x.toString().contains(y)){
        x.append(x);
        count++;
        if (count > 5){
          check = true;
          break;
        }
      }
      if (check){
        System.out.println(-1);
      }
      else {
        System.out.println(count);
      }
      numTests--;
    }
  }
}
