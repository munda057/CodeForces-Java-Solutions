import java.util.*;

public class ABeautifulMatrix {
  public static void main(String[] args) {
    List<List<String>> arr = new ArrayList<>();
    int[] cord = null;
    Scanner scanner = new Scanner(System.in);
    int twoD[][] = new int[5][5];
    for (int i = 0; i < 5; i++) {
      for (int j = 0; j < 5; j++) {
        twoD[i][j] = scanner.nextInt();
      }
    }
    for (int i = 0; i < 5; i++) {
      for (int j = 0; j < 5; j++) {
        if (twoD[i][j] == 1) {
          cord = new int[]{i + 1, j + 1};
        }
      }
    }
    int sum = Math.abs(3 - cord[0]) + Math.abs(3 - cord[1]);
    System.out.println(sum);
  }
}
