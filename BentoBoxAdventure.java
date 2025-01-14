import java.util.Arrays;
import java.util.Scanner;

public class BentoBoxAdventure {
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    String[] arr = scanner.nextLine().split(" ");
    int[] intArr = new int[arr.length];
    for(int i = 0; i < arr.length; i++){
      intArr[i] = Integer.parseInt(arr[i]);
    }
    Arrays.sort(intArr);
    int[] newint = new int[] {1,2,3,4,5};
    if (Arrays.equals(intArr, new int[]{1, 2, 3, 4})) {
      System.out.println(5);
    }
    else {
      for(int i = 0; i < intArr.length; i++){
        if (intArr[i] != newint[i]){
          System.out.println(newint[i]);
          break;
        }
      }
    }
  }
}
