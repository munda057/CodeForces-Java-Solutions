import java.util.Scanner;

public class BBorze {
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    String toDecode = scanner.nextLine();
    StringBuilder result = new StringBuilder();
    for (int i = 0; i < toDecode.length(); i++){
      if (toDecode.charAt(i) == '.'){
        result.append("0");
      }
      else if (i+1 < toDecode.length() && toDecode.charAt(i) == '-' && toDecode.charAt(i+1) == '.'){
        result.append("1");
        i++;
      }
      else if (i+1 < toDecode.length() && toDecode.charAt(i) == '-' && toDecode.charAt(i+1) == '-'){
        result.append("2");
        i++;
      }
    }
    System.out.println(result);
  }
}
