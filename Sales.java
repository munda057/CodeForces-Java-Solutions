import java.util.Arrays;
import java.util.Scanner;

public class Sales {
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    String[] array = scanner.nextLine().split(" ");
    int tests = Integer.parseInt(array[0]);
    int canCarry = Integer.parseInt(array[1]);

    String[] tvs = scanner.nextLine().split(" ");
    int[] intTvs = new int[tvs.length];
    for(int i = 0; i < tvs.length; i++){
      intTvs[i] =  Integer.parseInt(tvs[i]);
    }
    Arrays.sort(intTvs);
    int sum = 0;
    for(int i = 0; i < canCarry; i++){
      sum += intTvs[i];
    }
    System.out.println(Math.abs(sum));
  }
}
