import java.util.Scanner;

public class BigSegment {
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    int tests = Integer.parseInt(scanner.nextLine());
    int[] checkMax = new int[tests];
    int[] checkMin = new int[tests];
    int[][] arr = new int[tests][2];

    for (int i = 0; i < tests; i++){
      int tempOne = scanner.nextInt();
      int tempTwo = scanner.nextInt();
      arr[i][0] = tempOne;
      checkMin[i] = tempOne;
      arr[i][1] = tempTwo;
      checkMax[i] = tempTwo;
    }

    int min = Integer.MAX_VALUE;
    for (int i = 0; i < checkMin.length; i++){
      if (checkMin[i] < min){
        min = checkMin[i];
      }
    }

    int max = Integer.MIN_VALUE;
    for (int i = 0; i < checkMax.length; i++){
      if (checkMax[i] > max){
        max = checkMax[i];
      }
    }

    boolean check = false;
    for (int i = 0; i < arr.length; i++){
      if (min == arr[i][0] && max == arr[i][1]){
        System.out.println(i + 1);
        check = true;
      }
    }
    if (!check){
      System.out.println(-1);
    }
  }
}
