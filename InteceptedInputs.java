import javax.swing.*;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicReference;

public class InteceptedInputs {
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    int tests = Integer.parseInt(scanner.nextLine());
    while (tests > 0){
      int num = Integer.parseInt(scanner.nextLine());
      String[] arr = scanner.nextLine().split(" ");
      int toFind = num - 2;
      double[] result = findDim(arr, toFind);
      for (double j : result) {
        System.out.print((int)j + " ");
      }
      System.out.println();
      tests--;
    }
  }

  public static double[] findDim(String[] arr, int toFind){
    double[] toReturn = new double[2];
    HashMap<Double, Integer> map = new HashMap<>();
    for (String s : arr) {
      if (!map.containsKey((double)(toFind) / Integer.parseInt(s))) {
        map.put(Double.parseDouble(s), 1);
      } else {
        toReturn = new double[]{Double.parseDouble(s), toFind / Double.parseDouble(s)};
      }
    }
    return toReturn;
  }
}
