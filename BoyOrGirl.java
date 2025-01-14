import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class BoyOrGirl {
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    String name = scanner.nextLine();
    HashMap<Character, Integer> map = new HashMap<>();
    for(int i = 0; i < name.length(); i++){
      if (!map.containsKey(name.charAt(i))){
        map.put(name.charAt(i), 1);
      }
      else {
        map.put(name.charAt(i), map.get(name.charAt(i)) + 1);
      }
    }
    if (distinctCount(map) % 2 == 0){
      System.out.println("CHAT WITH HER!");
    }
    else {
      System.out.println("IGNORE HIM!");
    }
  }

  public static int distinctCount(HashMap<Character, Integer> map){
    int count = 0;
    for(Map.Entry<Character, Integer> m : map.entrySet()){
      count++;
    }
    return count;
  }
}
