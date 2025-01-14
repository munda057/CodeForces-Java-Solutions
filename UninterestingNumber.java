import java.util.Scanner;

public class UninterestingNumber {
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    int tests = Integer.parseInt(scanner.nextLine());
    while (tests > 0){
      String num = scanner.nextLine();
      int numOfTwos = 0;
      int numOfThrees = 0;
      int sum = 0;
      for (int i = 0; i < num.length(); i++){
        sum += Integer.parseInt(String.valueOf(num.charAt(i)));
        if (num.charAt(i) == '2'){
          numOfTwos++;
        }
        else if (num.charAt(i) == '3'){
          numOfThrees++;
        }
      }


      boolean check = false;
      if (numOfTwos == 0 && numOfThrees != 0){
        for (int i = 0; i <= Math.min(10,numOfThrees); i++){
          if ((sum + 6*i) % 9 == 0){
            check = true;
            break;
          }
        }
      } else if (numOfTwos != 0 && numOfThrees == 0) {
        for (int i = 0; i <= Math.min(10,numOfTwos); i++){
          if ((sum + 2*i) % 9 == 0){
            check = true;
            break;
          }
        }
      } else {
        for (int i = 0; i <= Math.min(10,numOfTwos); i++){
          for (int j = 0; j <= Math.min(10,numOfThrees); j++){
            if ((sum + 2*i + 6*j) % 9 == 0){
              check = true;
              break;
            }
          }
        }
      }

      if (check){
        System.out.println("YES");
      }
      else {
        System.out.println("NO");
      }
      tests--;
    }
  }
}
