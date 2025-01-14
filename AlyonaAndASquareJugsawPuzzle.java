import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class AlyonaAndASquareJugsawPuzzle {
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    int tests = scanner.nextInt();
    HashSet<Integer> set = new HashSet<>();
    int n = 100;
    int toPut = 0;
    int index = 1;
    int prev = 1;
    set.add(1);
    while (n > 0){
      toPut = (index * 4) + 4 + prev;
      prev = toPut;
      set.add(toPut);
      index++;
      index++;
      n--;
    }

    while (tests > 0){
      int days = scanner.nextInt();
      int[] arr = new int[days];
      for (int i = 0; i < arr.length; i++){
        arr[i] = scanner.nextInt();
      }
      int res = 0;
      int[] prefix = new int[days];
      for (int i = 0; i < arr.length; i++){
        prefix[i] = res + arr[i];
        res = prefix[i];
      }


      int count = 0;
      for (int i = 0; i < prefix.length; i++){
        if (set.contains(prefix[i])){
          count++;
        }
      }

      System.out.println(count);
      tests--;
    }
  }
}