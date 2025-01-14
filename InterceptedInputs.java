import java.util.HashMap;
import java.util.Scanner;

public class InterceptedInputs {
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    int tests = Integer.parseInt(scanner.nextLine());
    HashMap<Integer, Integer> map = new HashMap<>();
    while (tests > 0){
      int n = Integer.parseInt(scanner.nextLine());
      String[] a = scanner.nextLine().split(" ");
      for(int i = 0; i < n; i++){
        if (!map.containsKey(Integer.parseInt(a[i]))){
          map.put(Integer.parseInt(a[i]), 1);
        }
        else {
          map.put(Integer.parseInt(a[i]) , map.get(Integer.parseInt(a[i])) + 1);
        }
      }
      for(int i = 0; i < n; i++){

      }


      tests--;
    }
  }
}
