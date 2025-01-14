import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class RankList {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    ArrayList<Integer> arr = new ArrayList<>();
    int n = scanner.nextInt();
    int k = scanner.nextInt();
    int[][] keysAndVals = new int[n][2];
    for (int i = 0; i < n; i++){
      keysAndVals[i][0] = scanner.nextInt();
      keysAndVals[i][1] = scanner.nextInt();
    }

    Arrays.sort(keysAndVals, (a, b) -> {
      if (b[0] != a[0]) {
        return Integer.compare(b[0], a[0]);
      } else {
        return Integer.compare(a[1], b[1]);
      }
    });

    int key = keysAndVals[k - 1][0];
    int val = keysAndVals[k - 1][1];

    int count = 0;
    for (int i = 0; i < keysAndVals.length; i++){
      if (keysAndVals[i][0] == key && keysAndVals[i][1] == val){
        count++;
      }
    }

    System.out.println(count);
  }
}
