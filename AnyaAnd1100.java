import java.util.Scanner;

public class AnyaAnd1100 {
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    int tests = Integer.parseInt(scanner.nextLine());
    int inTest = 0;
    while (tests > 0){
      String toCheck = scanner.nextLine();
      inTest = Integer.parseInt(scanner.nextLine());
      if (toCheck.length() < 4){
        for(int i = 0; i < inTest; i++){
          String[] s = scanner.nextLine().split(" ");
          System.out.println("NO");
        }
      }
      else {
        StringBuilder s = new StringBuilder(toCheck);
        while (inTest > 0) {
          String[] arr = scanner.nextLine().split(" ");
          s = replace(Integer.parseInt(arr[0]), arr[1], String.valueOf(s));
          if (checkFor1100(String.valueOf(s))){
            System.out.println("YES");
          }
          else {
            System.out.println("NO");
          }
          inTest--;
        }
      }
      tests--;
    }
  }

  public static boolean checkFor1100(String s){
    for(int i = 3; i < s.length(); i++){
      if (s.charAt(i-3) == '1' && s.charAt(i-2) == '1'
      &&  s.charAt(i-1) == '0' && s.charAt(i) == '0'){
        return true;
      }
    }
    return false;
  }

  public static StringBuilder replace(int index, String num, String toReplace){
    StringBuilder result = new StringBuilder();
    for(int i = 0; i < toReplace.length(); i++){
      if (i == index - 1){
        result.append(num);
      }
      else {
        result.append(toReplace.charAt(i));
      }
    }
    return result;
  }
}
