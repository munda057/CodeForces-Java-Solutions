import java.util.Scanner;

public class BitPlusPlus {
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    int operations = Integer.parseInt(scanner.nextLine());
    int x = 0;
    for(int i = 0; i < operations; i++){
      String op = scanner.nextLine();
      for(int j = 0; j < op.length(); j++){
        if (op.charAt(j) == '+'){
          x++;
          break;
        }
        else if (op.charAt(j) == '-'){
          x--;
          break;
        }
      }
    }
    System.out.println(x);
  }
}
