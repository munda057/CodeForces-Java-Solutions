import java.util.Scanner;

public class PrimaryTask {
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    int tests = scanner.nextInt();
    while (tests > 0){
      int num = scanner.nextInt();
      int original = num;
      int one = num % 10;
      num = num/10;
      int two = num % 10;
      String result = Integer.toString(two) + Integer.toString(one);
      if (findFirstTwoNums(num) == 10){
        if (Integer.toString(original).length() > 3 && Integer.parseInt(result) < 10){
          System.out.println("NO");
        }
        else {
          if (Integer.parseInt(result) >= 2){
            System.out.println("YES");
          }
          else {
            System.out.println("NO");
          }
        }
      }
      else {
        System.out.println("NO");
      }
      tests--;
    }
  }

  public static int findFirstTwoNums (int num){
    while (num > 100){
      num = num / 10;
    }
    return num;
  }
}
