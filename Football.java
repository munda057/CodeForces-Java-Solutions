import jdk.jshell.spi.ExecutionControl;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;

public class Football {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int tests = Integer.parseInt(scanner.nextLine());

    HashMap<String, Integer> map = new HashMap<>();
    String toPrint = null;
    while (tests > 0) {
      String team = scanner.nextLine();
      if (!map.containsKey(team)) {
        map.put(team, 1);
      } else {
        map.put(team, map.get(team) + 1);
      }
      int max = Integer.MIN_VALUE;
      toPrint = "";
      for (Map.Entry<String, Integer> m : map.entrySet()) {
        int value = m.getValue();
        if (max < value) {
          max = value;
          toPrint = m.getKey();
        }
      }
      tests--;
    }
    System.out.println(toPrint);
  }
}
