import java.util.Scanner;

public class Expression {
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    int a = scanner.nextInt();
    int b = scanner.nextInt();
    int c = scanner.nextInt();
    int x = a + (b * c);
    int y = a * (b + c);
    int z = a * b * c;
    int m = (a + b) * c;
    int d = a + b + c;
    int res = Math.max(d, Math.max(x,Math.max(y,Math.max(z,m))));
    System.out.println(res);
  }
}
