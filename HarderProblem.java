import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HarderProblem {
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    int tests = Integer.parseInt(scanner.nextLine());
    while (tests > 0){
      int n = Integer.parseInt(scanner.nextLine());
      String[] arr = scanner.nextLine().split(" ");
      HashMap<Integer, Integer> map = new HashMap<>();
      for(int i = 0; i < arr.length; i++){
        if (!map.containsKey(Integer.parseInt(arr[i]))){
          map.put(Integer.parseInt(arr[i]), 1);
        }
        else {
          map.put(Integer.parseInt(arr[i]), map.get(Integer.parseInt(arr[i])) + 1);
        }
      }
      ArrayList<Integer> arrayList = new ArrayList<>();
      for (Map.Entry<Integer, Integer> m : map.entrySet()){
        arrayList.add(m.getKey());
      }


      tests--;
    }
  }
}
