import java.util.Scanner;
public class KefaAndFirstSteps {
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    int[] arr = new int[n];
    for (int i = 0; i < arr.length; i++){
      arr[i] = scanner.nextInt();
    }

    if (n == 1){
      System.out.println(1);
    }
    else {
      int count = 1;
      int max = Integer.MIN_VALUE;
      for (int i = 0; i < arr.length - 1; i++){
        if (arr[i] <= arr[i+1]){
          count++;
        }
        else {
          count = 1;
        }
        if (max < count){
          max = count;
        }
      }
      System.out.println(max);
    }
  }
}
