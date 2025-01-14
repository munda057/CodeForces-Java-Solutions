import java.io.*;
import java.util.Scanner;

public class BoysAndGirls {
  public static void main(String[] args) {
    try {
      Scanner scanner = new Scanner(new File("input.txt"));
      PrintWriter writer = new PrintWriter(new File("output.txt"));

      int n = scanner.nextInt();
      int m = scanner.nextInt();
      scanner.close();

      StringBuilder result = new StringBuilder();

      while (n > 0 && m > 0) {
        if (n >= m) {
          result.append('B').append('G');
          n--;
          m--;
        } else {
          result.append('G').append('B');
          n--;
          m--;
        }
      }

      while (n > 0) {
        result.append('B');
        n--;
      }

      while (m > 0) {
        result.append('G');
        m--;
      }

      writer.println(result.toString());
      writer.close();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
