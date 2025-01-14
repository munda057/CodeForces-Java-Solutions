import java.util.Scanner;

public class Watermelon {
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    int tocheck = scanner.nextInt();
    if (tocheck == 2){
      System.out.println("NO");
    }
    else if (tocheck % 2 == 0){
      System.out.println("YES");
    }
    else {
      System.out.println("NO");
    }
  }
}
