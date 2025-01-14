import java.util.Scanner;

public class llyaAndQueries {
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    String s = scanner.nextLine();
    int n = scanner.nextInt();
    while (n > 0){
      int l = scanner.nextInt();
      int r = scanner.nextInt();
      int count = 0;
      for (int i = l; i < r; i++){
        if (s.charAt(i - 1) == s.charAt(i)){
          count++;
        }
      }
      System.out.println(count);
      n--;
    }
  }
}


//This does not work! The algorithm is correct, but it takes more time as its O(n^2).
//This is a non DP solution.
