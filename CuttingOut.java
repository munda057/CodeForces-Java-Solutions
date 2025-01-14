import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CuttingOut {
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    String[] arr = scanner.nextLine().split(" ");
    int n = Integer.parseInt(arr[0]);
    int k = Integer.parseInt(arr[1]);
    HashMap<Integer, Integer> map = new HashMap<>();
    for(int i = 0; i < n; i++){
      if (!map.containsKey(Integer.parseInt(arr[i]))){
        map.put(Integer.parseInt(arr[i]), 1);
      }
      else {
        map.put(Integer.parseInt(arr[i]), map.get(Integer.parseInt(arr[i])) + 1);
      }
    }
    int[] freq = new int[n];
    int[] key = new int[n];
    int i = 0;
    for(Map.Entry<Integer, Integer> m : map.entrySet()){
      freq[i] = m.getValue();
      key[i] = m.getKey();
      i++;
    }
  }
}
