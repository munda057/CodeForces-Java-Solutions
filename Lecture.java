import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class Lecture {
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    String[] vals = scanner.nextLine().split(" ");
    int n = Integer.parseInt(vals[0]);
    int m = Integer.parseInt(vals[1]);
    HashSet<String> set = new HashSet<>();

    HashMap<String, String> map = new HashMap<>();
    while (m > 0){
      String a = scanner.next();
      String b = scanner.next();
      map.put(a,b);
      set.add(a);
      m--;
    }

    String[] fiArr = new String[n];
    for (int j = 0; j < n; j++){
      fiArr[j] = scanner.next();
    }

    StringBuilder s = new StringBuilder();
    for (int j = 0; j < n; j++){
      if (map.containsKey(fiArr[j])){
        if (map.get(fiArr[j]).length() > fiArr[j].length()){
          s.append(fiArr[j]).append(" ");
        }
        else if (map.get(fiArr[j]).length() == fiArr[j].length()){
          if (set.contains(map.get(fiArr[j]))){
            s.append(map.get(fiArr[j])).append(" ");
          }
          else {
            s.append(fiArr[j]).append(" ");
          }
        }
        else {
          s.append(map.get(fiArr[j])).append(" ");
        }
      }
    }
    System.out.println(s);
  }
}
