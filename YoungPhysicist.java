import java.util.Scanner;

public class YoungPhysicist {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int numOfLines = Integer.parseInt(scanner.nextLine());
    int[] arrX = new int[3];
    int[] arrY = new int[3];
    int[] arrZ = new int[3];
    int sum1 = 0;
    int sum2 = 0;
    int sum3 = 0;
    for(int i = 0; i < numOfLines; i++){
      String[] arr = scanner.nextLine().split(" ");
      sum1 += Integer.parseInt(arr[0]);
      sum2 += Integer.parseInt(arr[1]);
      sum3 += Integer.parseInt(arr[2]);
    }
    if (sum1 == 0 && sum2 == 0 && sum3 == 0){
      System.out.println("YES");
    }
    else {
      System.out.println("NO");
    }
  }
}