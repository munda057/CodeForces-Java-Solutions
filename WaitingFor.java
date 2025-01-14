import java.util.Scanner;

public class WaitingFor {
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    int tests = Integer.parseInt(scanner.nextLine());
    int people = 0;
    int busSeats = 0;
    while (tests > 0){
      String[] arr = scanner.nextLine().split(" ");
      if (arr[0].equals("P")){
        people += Integer.parseInt(arr[1]);
      }
      else if (arr[0].equals("B")){
        if (people >= Integer.parseInt(arr[1])){
          people = people - Integer.parseInt(arr[1]);
          System.out.println("NO");
        }
        else {
          people = 0;
          System.out.println("YES");
        }
      }
      tests--;
    }
  }
}
