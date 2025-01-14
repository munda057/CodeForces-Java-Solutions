import java.util.EventListener;
import java.util.IllegalFormatCodePointException;
import java.util.Scanner;

public class Foodball {
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    String[] players = scanner.nextLine().split("");
    String result = "";
    for(int i = 0; i < players.length; i++){
      result += players[i];
    }
    if (result.equals("10000000") || result.equals("01111111")){
      System.out.println("YES");
    }
    else {
      boolean check = false;
      int zeroCount = 0;
      boolean zeroWhile = false;
      int oneCount = 0;
      boolean oneWhile = false;
      for(int i = 0; i < players.length; i++){
        if (oneCount == 7 || zeroCount == 7){
          check = true;
          break;
        }
        if (players[i].equals("0")){
          zeroCount++;
          zeroWhile = true;
          oneWhile = false;
          oneCount = 0;
        }
        else if (players[i].equals("1")){
          oneCount++;
          oneWhile = true;
          zeroCount = 0;
          zeroWhile = false;
        }
      }
      if (check){
        System.out.println("YES");
      }
      else {
        System.out.println("NO");
      }
    }
  }
}
