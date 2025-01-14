import java.util.HashMap;
import java.util.Scanner;

public class Presents {
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    int[] arr = new int[n];
    for (int i = 0; i < n; i++){
      arr[i] = scanner.nextInt();
    }

    HashMap<Integer, Integer> map = new HashMap<>();
    for (int i = 0; i < n; i++){
      map.put(arr[i], (i + 1));
    }

    int[] result = new int[n];
    for (int i = 1; i < n + 1; i++){
      if (map.containsKey(i)){
        result[i - 1] = map.get(i);
      }
    }

    for (int i = 0; i < result.length; i++){
      System.out.print(result[i] + " ");
    }
  }
}
