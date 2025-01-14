import javax.swing.*;
import java.util.Scanner;

public class XAxis {
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    int tests = Integer.parseInt(scanner.nextLine());
    while (tests > 0){
      String[] arr = scanner.nextLine().split(" ");
      int min = Integer.MAX_VALUE;
      for(int i = 0; i < arr.length; i++){
        if (min > Integer.parseInt(arr[i])){
          min = Integer.parseInt(arr[i]);
        }
      }

      int max = Integer.MIN_VALUE;
      for(int i = 0; i < arr.length; i++){
        if (max < Integer.parseInt(arr[i])){
          max = Integer.parseInt(arr[i]);
        }
      }
      System.out.println(max - min);
      tests--;
    }
  }
}
