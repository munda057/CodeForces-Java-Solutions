import java.util.Scanner;

public class CutRibbon {
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    int a = scanner.nextInt();
    int b = scanner.nextInt();
    int c = scanner.nextInt();

    int max = Integer.MIN_VALUE;
    for (int i = 0; i <= 4000; i++){
      for (int j = 0; j <= 4000; j++){
        int zc = n - (i*a + j*b);
        if (zc < 0){
          break;
        }
        double z = zc / (double) c;
        if (z == (int) z){
          max = Math.max(max , (int) z + i + j);
        }
      }
    }

    System.out.println(max);

  }
}
