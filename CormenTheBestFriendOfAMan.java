import java.util.Scanner;

public class CormenTheBestFriendOfAMan {
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    int k = scanner.nextInt();
    int[] arr = new int[n];
    for (int i = 0; i < arr.length; i++){
      arr[i] = scanner.nextInt();
    }

    int count = 0;
    for (int i = 0; i < arr.length - 1; i++){
      if (k - (arr[i] + arr[i+1]) > 0){
        int temp = arr[i+1];
        arr[i+1] += k - (arr[i] + arr[i+1]);
        count += arr[i+1] - temp;
      }
    }
    System.out.println(count);
    for (int i = 0; i < arr.length; i++){
      System.out.print(arr[i] + " ");
    }
  }
}
