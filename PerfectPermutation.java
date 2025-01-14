import java.util.Scanner;

public class PerfectPermutation {
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    int perm = scanner.nextInt();

    if (perm % 2 != 0){
      System.out.println(-1);
    }
    else {
      int[] arr = new int[perm];

      for(int i = 0, j = 1; i < perm; i++){
        arr[i] = j;
        j++;
      }

      for(int i = 0; i < arr.length - 1; i++){
        int temp = arr[i];
        arr[i] = arr[i+1];
        arr[i+1] = temp;
        i++;
      }

      for(int i = 0; i < arr.length; i++){
        System.out.print(arr[i] + " ");
      }
    }
  }
}
