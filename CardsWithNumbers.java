import java.io.File;
import java.io.PrintWriter;
import java.util.HashSet;
import java.util.Scanner;

public class CardsWithNumbers {
  public static void main(String[] args){
    try {
      Scanner scanner = new Scanner(new File("input.txt"));
      PrintWriter writer = new PrintWriter(new File("output.txt"));
      int n = scanner.nextInt();
      int[] arr = new int[2*n];
      for (int i = 0; i < arr.length; i++){
        arr[i] = scanner.nextInt();
      }

      HashSet<Integer> set = new HashSet<>();
      int count = 0;
      for (int i = 0; i < arr.length; i++){
        for (int j = i + 1; j < arr.length; j++){
          if (arr[i] == arr[j] && !set.contains(i) && !set.contains(j)){
            set.add(i);
            set.add(j);
            count++;
            writer.println((i + 1) + " " + (j + 1));
          }
        }
      }

      if (count != n){
        writer.println(-1);
      }
      writer.close();
    }
    catch (Exception e){
      e.printStackTrace();
    }
  }
}
