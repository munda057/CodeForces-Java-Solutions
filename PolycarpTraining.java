import java.util.Arrays;
import java.util.Scanner;

public class PolycarpTraining {
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    int tests = Integer.parseInt(scanner.nextLine());
    String[] arr = scanner.nextLine().split(" ");
    int[] intArr = new int[tests];
    for(int i = 0; i < arr.length; i++){
      intArr[i] = Integer.parseInt(arr[i]);
    }
    Arrays.sort(intArr);
    int curr = 1;
    for(int i = 0; i < intArr.length; i++){
      if (intArr[i] >= curr){
        curr++;
      }
    }
    System.out.println(curr - 1);
  }
}
