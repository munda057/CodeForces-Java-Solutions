import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class NeneAndTheCardGame {
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    int tests = scanner.nextInt();
    while (tests > 0){
      int n = scanner.nextInt();
      int[] arr = new int[n];
      for (int i = 0; i < n; i++){
        arr[i] = scanner.nextInt();
      }
      HashMap<Integer, Integer> map = new HashMap<>();
      for (int j : arr) {
        if (!map.containsKey(j)) {
          map.put(j, 1);
        } else {
          map.put(j, map.get(j) + 1);
        }
      }

      int count = 0;
      for (Map.Entry<Integer, Integer> m : map.entrySet()){
        if (m.getValue() > 1){
          count += m.getValue() - 1;
        }
      }
      System.out.println(count);
      tests--;
    }
  }
}
