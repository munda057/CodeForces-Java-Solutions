import java.util.Scanner;

public class ChessForThree {
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    int tests = scanner.nextInt();
    while (tests > 0){
      int[] arr = new int[3];
      int sum = 0;
      for (int i = 0; i < arr.length; i++){
        arr[i] = scanner.nextInt();
        sum += arr[i];
      }
      if (sum % 2 == 1){
        System.out.println(-1);
      }
      else {
        System.out.println(Math.min(arr[0] + arr[1], sum/2));
      }
      tests--;
    }
  }
}
