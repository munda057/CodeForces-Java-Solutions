import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class StringTask {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String word = scanner.nextLine();
    word = word.toLowerCase();
    StringBuilder result = new StringBuilder();
    for(int i = 0; i < word.length(); i++){
      if (word.charAt(i) != 'A' && word.charAt(i) != 'a'
      &&  word.charAt(i) != 'O' && word.charAt(i) != 'o'
      &&  word.charAt(i) != 'Y' && word.charAt(i) != 'y'
      &&  word.charAt(i) != 'E' && word.charAt(i) != 'e'
      &&  word.charAt(i) != 'U' && word.charAt(i) != 'u'
      &&  word.charAt(i) != 'I' && word.charAt(i) != 'i'){
        result.append(word.charAt(i));
      }
    }
    StringBuilder toReturn = new StringBuilder();
    for (int i = 0; i < result.length(); i++){
      toReturn.append(".");
      if (result.charAt(i) >= 'A' && result.charAt(i) <= 'Z'){

      }
      toReturn.append(result.charAt(i));
    }
    System.out.println(toReturn);
  }
}
