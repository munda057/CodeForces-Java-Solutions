import java.util.Scanner;

public class Transfusion {
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    int tests = Integer.parseInt(scanner.nextLine());
    while (tests > 0){
      int n = Integer.parseInt(scanner.nextLine());
      String[] arr = scanner.nextLine().split(" ");
      long odd = 0;
      long oddCount = 0;
      long even = 0;
      long evenCount = 0;
      for(int i = 0; i < n; i++){
        if (i % 2 == 0){
          even += Integer.parseInt(arr[i]);
          evenCount++;
        }
        else {
          odd += Integer.parseInt(arr[i]);
          oddCount++;
        }
      }
      double y = 0;
      double x = 0;
      long sum = even + odd;
      if(sum % n == 0){
        x = (double) odd / oddCount;
        y = (double) even / evenCount;
        if (x == y){
          System.out.println("YES");
        }
        else {
          System.out.println("NO");
        }
      }
      else {
        System.out.println("NO");
      }
      tests--;
    }
  }
}
