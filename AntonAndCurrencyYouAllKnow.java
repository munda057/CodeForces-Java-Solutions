import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Arrays;
import java.util.Scanner;

public class AntonAndCurrencyYouAllKnow {
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    String s = scanner.nextLine();
    int currencyVal = Integer.parseInt(s);
    int x = currencyVal % 10;
    int count = 0;
    int evenAt = 0;
    int firstEvenAt = 0;
    boolean check = false;
    int n = 0;
    while (currencyVal > 0){
      n = currencyVal % 10;
      currencyVal = currencyVal / 10;
      if (n % 2 == 0){
        evenAt = count;
      }
      if (n % 2 == 0 && !check){
        firstEvenAt = count;
        check = true;
      }
      count++;
    }
    System.out.println(evenAt);
    System.out.println(n);
    if (n % 2 == 0 && x > n){
      String result = swapCharacters(s, evenAt, 0);
      System.out.println(result);
    }
    else {
      String result = swapCharacters(s, firstEvenAt, 0);
      System.out.println(result);
    }
  }

  public static String swapCharacters(String str, int index1, int index2) {
    char[] charArray = str.toCharArray();
    char temp = charArray[index1];
    charArray[index1] = charArray[index2];
    charArray[index2] = temp;
    return new String(charArray);
  }
}
