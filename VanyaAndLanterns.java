import java.util.Arrays;
import java.util.Scanner;

public class VanyaAndLanterns {
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    int numLanterns = scanner.nextInt();
    int length = scanner.nextInt();
    int[] pos = new int[numLanterns];
    for (int i = 0; i < numLanterns; i++){
      pos[i] = scanner.nextInt();
    }

    Arrays.sort(pos);

    double min = pos[0];
    for (int i = 0; i < pos.length - 1; i++){
      double next = pos[i] + min;
      if (next < pos[i + 1] - min){
        min = (double) (pos[i + 1] - pos[i]) / 2;
      }
    }

    if (length > pos[pos.length - 1] + min){
      min = length - pos[pos.length - 1];
    }
    System.out.println(min);
  }
}
