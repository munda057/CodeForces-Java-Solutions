import java.util.Scanner;

public class ContestOne {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int numOfTests = Integer.parseInt(scanner.nextLine());

    while (numOfTests > 0) {
      int toCheck = Integer.parseInt(scanner.nextLine());
      int toCheckOther = toCheck;
      int count = 0;

      while (toCheckOther > 0) {
        int digit = toCheckOther % 10;
        if (digit != 0) {
          count++;
        }
        toCheckOther /= 10;
      }

      System.out.println(count);

      StringBuilder result = new StringBuilder();
      int position = 0;

      while (toCheck > 0) {
        int digit = toCheck % 10;
        if (digit != 0) {
          result.insert(0, (int)(digit * Math.pow(10, position)) + " ");
        }
        toCheck /= 10;
        position++;
      }

      System.out.println(result.toString().trim());

      numOfTests--;
    }

    scanner.close();
  }
}
