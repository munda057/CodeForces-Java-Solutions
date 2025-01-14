import java.util.Scanner;

public class Aword {
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    String word = scanner.nextLine();
    int uppercount = 0;
    int lowercount = 0;
    for(int i = 0; i < word.length(); i++){
      if (word.charAt(i) >= 'a' && word.charAt(i) <= 'z'){
        lowercount++;
      }
      else {
        uppercount++;
      }
    }
    if (lowercount >= uppercount){
      System.out.println(word.toLowerCase());
    }
    else {
      System.out.println(word.toUpperCase());
    }
  }
}
