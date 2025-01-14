import java.util.Scanner;

public class AWordCapitalization {
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    String word = scanner.nextLine();
    System.out.println(capitalize(word));
  }
  public static String capitalize(String word){
    word = word.substring(0,1).toUpperCase() + word.substring(1);
    return word;
  }
}
