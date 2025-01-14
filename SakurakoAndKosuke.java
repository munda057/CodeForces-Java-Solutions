import java.util.Scanner;

public class SakurakoAndKosuke {
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    int games = scanner.nextInt();
    for(int i = 0; i < games; i++){
      int number = scanner.nextInt();
      int x = 0;
      int j = 0;
      boolean isNeg = true;
      while (number != Math.abs(x)){
        if (isNeg){
          x = x - (2 * j) - 1;
          isNeg = false;
        }
        else {
          x = x + (2 * j) - 1;
          isNeg = true;
        }
      }
      if (isNeg){
        System.out.println("Sakurako");
      }
      else {
        System.out.println("Kosuke");
      }
    }
  }
}
