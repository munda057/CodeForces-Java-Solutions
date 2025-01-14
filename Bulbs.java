import java.util.HashSet;
import java.util.Scanner;

public class Bulbs {
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    HashSet<Integer> set = new HashSet<>();
    int count = 0;
    int n = scanner.nextInt();
    int m = scanner.nextInt();
    while (n > 0){
      int x = scanner.nextInt();
      int[] arr = new int[x];
      for (int i = 0; i < x; i++){
        arr[i] = scanner.nextInt();
      }

      for (int i = 0; i < arr.length; i++){
        if (!set.contains(arr[i])){
          set.add(arr[i]);
          count++;
        }
      }
      n--;
    }
    if (count != m){
      System.out.println("NO");
    }
    else {
      System.out.println("YES");
    }
  }
}
