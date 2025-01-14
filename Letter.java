import java.rmi.MarshalledObject;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Letter {
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    HashMap<Character, Integer> map = new HashMap<>();
    String[] arr = scanner.nextLine().trim().split(" ");
    String result = String.join("", arr);
    for(int i = 0; i < result.length(); i++){
      if (!map.containsKey(result.charAt(i))){
        map.put(result.charAt(i), 1);
      }
      else {
        map.put(result.charAt(i), map.get(result.charAt(i)) + 1);
      }
    }

    HashMap<Character, Integer> mapZ = new HashMap<>();
    String[] toCheck = scanner.nextLine().trim().split(" ");
    String stringCheck = String.join("", toCheck);
    for(int i = 0; i < stringCheck.length(); i++){
      if (!mapZ.containsKey(stringCheck.charAt(i))){
        mapZ.put(stringCheck.charAt(i), 1);
      }
      else {
        mapZ.put(stringCheck.charAt(i), mapZ.get(stringCheck.charAt(i)) + 1);
      }
    }

    boolean c = false;
    for (Map.Entry<Character, Integer> m : mapZ.entrySet()){
      if (!map.containsKey(m.getKey())){
        System.out.println("NO");
        c = true;
        break;
      }
      else {
        if (map.get(m.getKey()) < m.getValue()){
          System.out.println("NO");
          c = true;
          break;
        }
      }
    }

    if (!c) {
      System.out.println("YES");
    }
  }
}
