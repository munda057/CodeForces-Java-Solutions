import java.util.Arrays;
import java.util.Scanner;

public class Sale {
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    String[] nAndM = scanner.nextLine().split(" ");
    int n = Integer.parseInt(nAndM[0]);
    int m = Integer.parseInt(nAndM[1]);

    String[] tvs = scanner.nextLine().split(" ");
    int sum = 0;
    int[] arr = new int[tvs.length];
    for(int i = 0; i < tvs.length; i++){
      arr[i] = Integer.parseInt(tvs[i]);
    }
    Arrays.sort(arr);
    for(int i = 0; i < m; i++){
      if (arr[i] < 0){
        sum += Math.abs(arr[i]);
      }
    }
    System.out.println(sum);
  }
}
