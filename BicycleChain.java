import java.util.Scanner;

public class BicycleChain {
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    int starts = Integer.parseInt(scanner.nextLine());
    String[] starIntegers = scanner.nextLine().split(" ");

    int rear = Integer.parseInt(scanner.nextLine());
    String[] starInRear = scanner.nextLine().split(" ");
    int max = Integer.MIN_VALUE;
    for(int i = 0; i < starIntegers.length; i++){
      for(int j = 0; j < starInRear.length; j++){
        if (max < Integer.parseInt(starInRear[j]) / Integer.parseInt(starIntegers[i]) && Integer.parseInt(starInRear[j]) % Integer.parseInt(starIntegers[i]) == 0){
          max = Integer.parseInt(starInRear[j]) / Integer.parseInt(starIntegers[i]);
        }
      }
    }
    int count = 0;
    for(int i = 0; i < starIntegers.length; i++){
      for(int j = 0; j < starInRear.length; j++){
        if (max == Integer.parseInt(starInRear[j]) / Integer.parseInt(starIntegers[i]) && Integer.parseInt(starInRear[j]) % Integer.parseInt(starIntegers[i]) == 0){
          count++;
        }
      }
    }
    System.out.println(count);
  }
}
