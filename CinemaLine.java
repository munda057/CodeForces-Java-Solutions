import javax.swing.plaf.IconUIResource;
import java.util.Scanner;

public class CinemaLine {
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    int[] arr = new int[n];
    for (int i = 0; i < n; i++){
      arr[i] = scanner.nextInt();
    }

    boolean check = true;
    int numOf25s = 0;
    int numOf50s = 0;
    for (int i = 0; i < arr.length; i++){
      if (arr[i] == 25){
        numOf25s++;
      }
      else if (arr[i] == 50){
        if (numOf25s >= 1){
          numOf25s--;
        }
        else {
          System.out.println("NO");
          check = false;
          break;
        }
        numOf50s++;
      }
      else if (arr[i] == 100){
        if (numOf25s >= 1 && numOf50s >= 1){
          numOf25s--;
          numOf50s--;
        }
        else if (numOf25s > 2){
          numOf25s--;
          numOf25s--;
          numOf25s--;
        }
        else {
          System.out.println("NO");
          check = false;
          break;
        }
      }
    }
    if (check){
      System.out.println("YES");
    }
  }
}
