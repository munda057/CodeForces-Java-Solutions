import java.util.Scanner;

public class WayTooLongWords {
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    int words = Integer.parseInt(scanner.nextLine());
    for(int i = 0; i < words; i++) {
      int count = 0;
      String word = scanner.nextLine();
      if (word.length() <= 10) {
        System.out.println(word);
      } else {
        for (int j = 1; j < word.length() - 1; j++) {
          count++;
        }
        System.out.println(word.charAt(0) + "" + count + word.charAt(word.length() - 1));
      }
    }
  }
}
