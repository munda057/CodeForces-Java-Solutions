import java.util.Scanner;

public class DreamoonAndWifi {
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    String x = scanner.nextLine();
    String y = scanner.nextLine();
    int sum = 0;
    for (int i = 0; i < x.length(); i++){
      if (x.charAt(i) == '+'){
        sum++;
      }
      else {
        sum--;
      }
    }

    int targetPos = sum;
    int n = 0;
    int startingPos = 0;
    for (int i = 0; i < y.length(); i++){
      if (y.charAt(i) == '?'){
        n++;
      }
    }

    for (int i = 0; i < y.length(); i++) {
      if (y.charAt(i) == '+') {
        startingPos++;
      } else if (y.charAt(i) == '-') {
        startingPos--;
      }
    }
  }
}
