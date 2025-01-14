import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class kString {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int k = Integer.parseInt(scanner.nextLine());
    String s = scanner.nextLine();

    HashMap<Character, Integer> map = new HashMap<>();
    for (char c : s.toCharArray()) {
      map.put(c, map.getOrDefault(c, 0) + 1);
    }

    StringBuilder baseString = new StringBuilder();
    for (Map.Entry<Character, Integer> entry : map.entrySet()) {
      if (entry.getValue() % k != 0) {
        System.out.println(-1);
        return;
      }
      int repeat = entry.getValue() / k;
      baseString.append(String.valueOf(entry.getKey()).repeat(repeat));
    }

    System.out.println(baseString.toString().repeat(k));
  }
}
