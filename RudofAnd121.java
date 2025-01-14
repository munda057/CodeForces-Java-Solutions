import java.util.Arrays;
import java.util.Scanner;

public class RudofAnd121 {
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    int t = scanner.nextInt();
    while (t > 0){
      int n = scanner.nextInt();
      int[] arr = new int[n];
      for (int i = 0; i < arr.length; i++){
        arr[i] = scanner.nextInt();
      }

      while (!checkIfAllZeros(arr)){
        int index = getMax(arr);
        if (index > 0){
          arr[index] -= 2;
          arr[index - 1]--;
          arr[index + 1]--;
        }
      }

      if (checkIfAllZeros(arr)){
        System.out.println("YES");
      }
      else {
        System.out.println("NO");
      }
    }
  }

  public static int getMax(int[] arr){
    int max = Integer.MIN_VALUE;
    int maxIndex = 0;
    for (int i = 0; i < arr.length; i++){
      if (arr[i] > max){
        max = arr[i];
        maxIndex = i;
      }
    }
    return maxIndex;
  }

  public static boolean checkIfAllZeros(int[] arr){
    boolean check = true;
    for (int i = 0; i < arr.length; i++){
      if (arr[i] != 0){
        check = false;
        break;
      }
    }
    return check;
  }
}
