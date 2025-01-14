import java.util.Scanner;

public class Sail {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String[] arr = scanner.nextLine().split(" ");
    int t = Integer.parseInt(arr[0]);
    int xs = Integer.parseInt(arr[1]);
    int ys = Integer.parseInt(arr[2]);
    int xe = Integer.parseInt(arr[3]);
    int ye = Integer.parseInt(arr[4]);

    String wind = scanner.nextLine();

    int eastNeeded = Math.max(0, xe - xs);
    int westNeeded = Math.max(0, xs - xe);
    int northNeeded = Math.max(0, ye - ys);
    int southNeeded = Math.max(0, ys - ye);

    int eastCount = 0, westCount = 0, northCount = 0, southCount = 0;

    for (int i = 0; i < wind.length(); i++) {
      char direction = wind.charAt(i);
      if (direction == 'E' && eastCount < eastNeeded) {
        eastCount++;
      } else if (direction == 'W' && westCount < westNeeded) {
        westCount++;
      } else if (direction == 'N' && northCount < northNeeded) {
        northCount++;
      } else if (direction == 'S' && southCount < southNeeded) {
        southCount++;
      }

      if (eastCount == eastNeeded && westCount == westNeeded &&
          northCount == northNeeded && southCount == southNeeded) {
        System.out.println(i + 1);
        return;
      }
    }
    System.out.println(-1);
  }
}
