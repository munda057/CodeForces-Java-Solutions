import java.util.Scanner;

public class Joystick {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int first = scanner.nextInt();
    int second = scanner.nextInt();
    int count = 0;

    if (first == 1 && second == 1){
      System.out.println(0);
    }
    else {
      while (first > 0 && second > 0) {
        if (first <= second) {
          first += 1;
          second -= 2;
        } else {
          second += 1;
          first -= 2;
        }
        count++;
      }
      System.out.println(count);
    }
  }
}
