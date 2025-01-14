import javax.swing.*;
import java.util.Scanner;

public class Polycarp {
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    int tests = Integer.parseInt(scanner.nextLine());
    String n = "314159265358979323846264338327";

    while(tests > 0){
      int count = 0;
      String toCheck = scanner.nextLine();
      for(int i = 0; i < toCheck.length(); i++){
        if (toCheck.charAt(i) == n.charAt(i)){
          count++;
        }
        else{
          break;
        }
      }
      System.out.println(count);
      tests--;
    }

  }
}
