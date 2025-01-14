import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class LittleGirlAndGames {
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    HashMap<String, Integer> map = new HashMap<>();
    String[] arr = scanner.nextLine().split("");
    for (String s : arr) {
      if (!map.containsKey(s)) {
        map.put(s, 1);
      } else {
        map.put(s, map.get(s) + 1);
      }
    }
    int count = 0;
    for(Map.Entry<String, Integer> m : map.entrySet()){
      if(m.getValue() % 2 == 1){
        count++;
      }
    }

    if (count <= 1){
      System.out.println("First");
    }
    else if (count % 2 == 0){
      System.out.println("Second");
    }
    else {
      System.out.println("First");
    }
  }
}
