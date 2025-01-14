import java.util.*;

public class ComparingStrings {
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    String[] first = scanner.nextLine().split("");
    String[] second = scanner.nextLine().split("");
    if (first.length != second.length){
      System.out.println("NO");
    }
    else {
      int count = 0;
      for(int i = 0; i < first.length; i++){
        if (!first[i].equals(second[i])){
          count++;
        }
      }
      if (count > 2){
        System.out.println("NO");
      }
      else {
        boolean check = false;
        Arrays.sort(first);
        Arrays.sort(second);
        for (int i = 0; i < first.length; i++){
          if (!first[i].equals(second[i])){
            check = true;
            System.out.println("NO");
            break;
          }
        }
        if (!check){
          System.out.println("YES");
        }
      }
    }
  }
}
