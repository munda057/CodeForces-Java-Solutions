import java.util.Arrays;
import java.util.Scanner;

public class NextRound {
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    String[] arrayOne = scanner.nextLine().split(" ");
    int n = Integer.parseInt(arrayOne[0]);
    int k = Integer.parseInt(arrayOne[1]);
    String[] array = scanner.nextLine().split(" ");
    int num = Integer.parseInt(array[k-1]);
    int count = 0;
    for(int i = 0; i < n; i++){
      if (Integer.parseInt(array[i]) >= num && Integer.parseInt(array[i]) > 0){
        count++;
      }
    }
    System.out.println(count);
  }
}
