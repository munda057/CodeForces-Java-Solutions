import javax.swing.*;
import java.util.Scanner;

public class FixingTheExpression {
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    int tests = Integer.parseInt(scanner.nextLine());
    while (tests > 0){
      String[] array = scanner.nextLine().split("");
      String operation = array[1];
      if (operation.equals("<")){
        if (!(Integer.parseInt(array[0]) < Integer.parseInt(array[2]))){
          if (Integer.parseInt(array[0]) == (9)){
            array[1] = ">";
          }
          else {
            int n = Integer.parseInt(array[0]) - Integer.parseInt(array[2]);
            array[2] = Integer.toString(Integer.parseInt(array[2]) + n + 1);
          }
        }
      }
      else if (operation.equals(">")){
        if (!(Integer.parseInt(array[0]) > Integer.parseInt(array[2]))){
          if (Integer.parseInt(array[2]) == (9)){
            array[1] = "<";
          }
          else {
            int n = Integer.parseInt(array[2]) - Integer.parseInt(array[0]);
            array[0] = Integer.toString(Integer.parseInt(array[0]) + n + 1);
          }
        }
      }
      else if (operation.equals("=")){
        if (!(Integer.parseInt(array[0]) == Integer.parseInt(array[2]))){
          if (Integer.parseInt(array[0]) > Integer.parseInt(array[2])){
            array[1] = ">";
          }
          else {
            array[1] = "<";
          }
        }
      }
      for(int i = 0; i < array.length; i++){
        System.out.print(array[i]);
      }
      System.out.println();
      tests--;
    }
  }
}
