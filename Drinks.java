import java.util.Scanner;

public class Drinks {
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    int drinks = Integer.parseInt(scanner.nextLine());
    int sum = 0;
    for(int i = 0; i < drinks; i++){
      sum += scanner.nextInt();
    }
    double result = (double) sum / drinks;
    System.out.println(result);
  }
}
