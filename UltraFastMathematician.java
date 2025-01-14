import java.util.Arrays;
import java.util.Scanner;

public class UltraFastMathematician {
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    String[] arr1 = scanner.nextLine().split("");
    String[] arr2 = scanner.nextLine().split("");
    String[] result = new String[arr1.length];
    for(int i = 0; i < arr1.length; i++){
      if (arr1[i].equals(arr2[i])){
        result[i] = "0";
      }
      else{
        result[i] = "1";
      }
    }
    for(int i = 0; i < result.length; i++){
      System.out.print(result[i]);
    }
  }
}
