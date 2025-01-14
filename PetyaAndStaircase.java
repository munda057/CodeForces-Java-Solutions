import java.util.Arrays;
import java.util.Scanner;

public class PetyaAndStaircase {
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    int m = scanner.nextInt();
    int[] dirtyStairs = new int[m];

    if (m == 0){
      System.out.println("YES");
    }
    else {
      for (int i = 0; i < m; i++){
        dirtyStairs[i] = scanner.nextInt();
      }

      Arrays.sort(dirtyStairs);

      if (dirtyStairs[dirtyStairs.length - 1] == n || dirtyStairs[0] == 1){
        System.out.println("NO");
      }
      else {
        boolean check = false;
        for (int i = 0; i < dirtyStairs.length - 2; i++){
          if (dirtyStairs[i + 2] - dirtyStairs[i + 1] == 1 &&
              dirtyStairs[i + 1] - dirtyStairs[i] == 1){
            check = true;
            break;
          }
        }
        if (check){
          System.out.println("NO");
        }
        else {
          System.out.println("YES");
        }
      }
    }
  }
}
