import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Dragon {
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    String[] arr = scanner.nextLine().split(" ");
    ArrayList<Integer> arrayList = new ArrayList<>();
    int initialStrength = Integer.parseInt(arr[0]);
    int dragons = Integer.parseInt(arr[1]);

    int[][] strengthAndBonus = new int[dragons][2];
    for(int i = 0; i < dragons; i++){
      strengthAndBonus[i][0] = scanner.nextInt();
      strengthAndBonus[i][1] = scanner.nextInt();
    }

    Arrays.sort(strengthAndBonus, (a,b) -> Integer.compare(a[0], b[0]));
    boolean check = false;
    for(int i = 0; i < strengthAndBonus.length; i++){
      if (strengthAndBonus[i][0] < initialStrength){
        initialStrength += strengthAndBonus[i][1];
      }
      else {
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
