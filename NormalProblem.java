import java.util.Scanner;

public class NormalProblem {
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    int tests = Integer.parseInt(scanner.nextLine());
    while (tests > 0){
      String s = scanner.nextLine();
      String updated = "";
      for(int i = s.length() - 1; i >= 0; i--){
        updated += s.charAt(i);
      }
      String result = "";
      for(int i = 0; i < updated.length(); i++){
        if(updated.charAt(i) == 'q'){
          result += 'p';
        }
        else if (updated.charAt(i) == 'p'){
          result += 'q';
        }
        else {
          result += updated.charAt(i);
        }
      }
      System.out.println(result);
      tests--;
    }
  }
}
