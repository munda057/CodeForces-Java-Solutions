import java.util.Scanner;

public class ANearlyLuckyNumber {
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    String input = scanner.nextLine();
    if (input.length() > 18 || input.isEmpty()){
      System.out.println("NO");
    }
    else {
      long number = Long.parseLong(input);
      if (luckycheck(number)){
        System.out.println("YES");
      }
      else {
        System.out.println("NO");
      }
    }
  }

  public static boolean luckycheck(long number){
    int count = 0;
    while(number > 0){
      long digit = number % 10;
      number = number / 10;
      if (digit == 7 || digit == 4){
        count++;
      }
    }
    if(count == 7 || count == 4){
      return true;
    }
    return false;
  }
}
