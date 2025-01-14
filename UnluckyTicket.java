import java.util.*;

public class UnluckyTicket {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int digits = Integer.parseInt(scanner.nextLine());
    String ticket = scanner.nextLine();

    char[] firstHalf = ticket.substring(0, digits).toCharArray();
    char[] secondHalf = ticket.substring(digits).toCharArray();

    Arrays.sort(firstHalf);
    Arrays.sort(secondHalf);

    boolean strictlyLess = true;
    boolean strictlyGreater = true;

    for (int i = 0; i < digits; i++) {
      if (firstHalf[i] >= secondHalf[i]) {
        strictlyLess = false;
      }
      if (firstHalf[i] <= secondHalf[i]) {
        strictlyGreater = false;
      }
    }

    if (strictlyLess || strictlyGreater) {
      System.out.println("YES");
    } else {
      System.out.println("NO");
    }
  }
}
