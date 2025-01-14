import java.util.Scanner;

public class HungrySequence {
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    int[] arr = new int[n];
    for(int i = 0; i < n; i++){
      arr[i] = (3 * n) + i;
    }
    for (int i = 0; i < arr.length; i++){
      System.out.print(arr[i] + " ");
    }
  }
}
