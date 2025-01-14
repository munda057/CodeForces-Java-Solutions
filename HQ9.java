import java.util.Scanner;

public class HQ9 {
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    String[] arr = scanner.nextLine().split("");
    boolean check = false;
    for(int i = 0; i < arr.length; i++){
      if (arr[i].equals("H")){
        check = true;
        System.out.println("YES");
        break;
      } else if (arr[i].equals("Q")) {
        check = true;
        System.out.println("YES");
        break;
      } else if (arr[i].equals("9")) {
        check = true;
        System.out.println("YES");
        break;
      }
    }
    if (!check){
      System.out.println("NO");
    }
  }
}
