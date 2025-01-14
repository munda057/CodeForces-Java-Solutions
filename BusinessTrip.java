import java.util.Arrays;
import java.util.Scanner;

public class BusinessTrip {
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    int centi = Integer.parseInt(scanner.nextLine());
    int numOfMonths = 12;
    String[] months = scanner.nextLine().split(" ");
    int[] intMonths = new int[numOfMonths];
    for(int i = 0; i < numOfMonths; i++){
      intMonths[i] = Integer.parseInt(months[i]);
    }
    Arrays.sort(intMonths);
    int sum = 0;
    int count = 0;
    for (int i = numOfMonths - 1; i >= 0; i--){
      if (sum >= centi){
        break;
      }
      sum += intMonths[i];
      count++;
    }
    if (sum < centi){
      System.out.println(-1);
    }
    else {
      System.out.println(count);
    }
  }
}
