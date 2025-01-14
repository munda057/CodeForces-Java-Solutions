import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class FreeCash {
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    int tests = scanner.nextInt();
    int[] arr = new int[tests];
    int i = 0;
    int everSum = 0;
    while (tests > 0){
      everSum = 0;
      int h = scanner.nextInt();
      int m = scanner.nextInt();
      everSum = h * 60 + m;
      arr[i] = everSum;
      i++;
      tests--;
    }

    HashMap<Integer, Integer> map = new HashMap<>();
    for (int j = 0; j < arr.length; j++){
      if (!map.containsKey(arr[j])){
        map.put(arr[j], 1);
      }
      else {
        map.put(arr[j], map.get(arr[j]) + 1);
      }
    }

    int max = Integer.MIN_VALUE;
    for (Map.Entry<Integer, Integer> m : map.entrySet()){
      if (m.getValue() > max){
        max = m.getValue();
      }
    }
    System.out.println(max);
  }
}
