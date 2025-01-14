import java.util.Scanner;

public class MagicNumber {
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    String number = scanner.nextLine();

    for(int i = 0; i < number.length(); i++){
      if (number.charAt(i) != '1' | number.charAt(i) != '4'){
        System.out.println("NO");
      }
    }
  }
}
