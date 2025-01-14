import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class VasyaAndWrestling {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    List<Integer> first = new ArrayList<>();
    List<Integer> second = new ArrayList<>();
    long total = 0;
    int last = 0;

    for (int i = 0; i < n; i++) {
      int point = scanner.nextInt();
      total += point;
      if (point > 0) {
        first.add(point);
      } else {
        second.add(-point);
      }
      if (i == n - 1) {
        last = point;
      }
    }

    if (total > 0) {
      System.out.println("first");
    } else if (total < 0) {
      System.out.println("second");
    } else {
      int len = Math.min(first.size(), second.size());
      for (int i = 0; i < len; i++) {
        if (!first.get(i).equals(second.get(i))) {
          if (first.get(i) > second.get(i)) {
            System.out.println("first");
          } else {
            System.out.println("second");
          }
          return;
        }
      }

      if (first.size() > second.size()) {
        System.out.println("first");
      } else if (first.size() < second.size()) {
        System.out.println("second");
      } else {
        if (last > 0) {
          System.out.println("first");
        } else {
          System.out.println("second");
        }
      }
    }
  }
}
