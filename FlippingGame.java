import java.util.Scanner;

public class FlippingGame {
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    int[] arr = new int[n];
    for (int i = 0; i < n; i++){
      arr[i] = scanner.nextInt();
    }

    int count = 0;
    int sum = 0;
    int max = Integer.MIN_VALUE;
    for (int i = 0; i < arr.length; i++){
      if (arr[i] == 0){
        sum++;
      }
      else {
        sum--;
        count++;
      }

      if (sum > max){
        max = sum;
      }
      if (sum < 0){
        sum = 0;
      }
    }
    System.out.println(max + count);
  }
}
