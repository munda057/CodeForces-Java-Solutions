import java.util.Scanner;

public class FrogJumping {
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);

    int tests = Integer.parseInt(scanner.nextLine());
    while (tests > 0){
      String[] arr = scanner.nextLine().split(" ");
      int a = Integer.parseInt(arr[0]);
      int b = Integer.parseInt(arr[1]);
      int k = Integer.parseInt(arr[2]);
      int evenTimes = 0;
      if (k % 2 == 1){
        evenTimes = k/2 + 1;
      }
      else {
        evenTimes = k/2;
      }
      long result = (long) a * evenTimes;
      result -= (long) b * (k - evenTimes);
      System.out.println(result);
      tests--;
    }
  }
}
