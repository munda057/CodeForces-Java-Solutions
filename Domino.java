import java.util.Scanner;

public class Domino {
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    int d = scanner.nextInt();
    int[] upper = new int[d];
    int[] lower = new int[d];
    int sumUpper = 0;
    int sumLower = 0;

    for (int i = 0; i < d; i++){
      upper[i] = scanner.nextInt();
      sumUpper += upper[i];
      lower[i] = scanner.nextInt();
      sumLower += lower[i];
    }

    boolean check = false;

    if (sumUpper % 2 == 0 && sumLower % 2 == 0){
      System.out.println(0);
    }
    else if (sumUpper % 2 == 1 && sumLower % 2 == 1){
      for (int i = 0; i < d; i++){
        if (upper[i] % 2 == 0 && lower[i] % 2 == 1 || upper[i] % 2 == 1 && lower[i] % 2 == 0){
          System.out.println(1);
          check = true;
          break;
        }
      }
      if (!check){
        System.out.println(-1);
      }
    }
    else {
      System.out.println(-1);
    }
  }
}
