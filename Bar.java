import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class Bar {
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    String[] drinks = {"ABSINTH", "BEER", "BRANDY", "CHAMPAGNE", "GIN", "RUM", "SAKE", "TEQUILA", "VODKA", "WHISKEY", "WINE"};
    HashSet<String> set = new HashSet<>(Arrays.asList(drinks));

    int count = 0;
    int n = scanner.nextInt();
    for (int i = 0; i < n; i++){
      if (scanner.hasNextInt()) {
        int number = scanner.nextInt();
        if (number < 18) {
          count++;
        }
      }
      else {
        if (set.contains(scanner.next())){
          count++;
        }
      }
    }
    System.out.println(count);
  }
}
