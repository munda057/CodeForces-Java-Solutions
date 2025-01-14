import java.util.Scanner;

public class Cherry {
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    int tests = Integer.parseInt(scanner.nextLine());
    while (tests > 0){
      int n = Integer.parseInt(scanner.nextLine());
      String[] arr = scanner.nextLine().split(" ");
      int max = Integer.MIN_VALUE;
      int maxIndex = 0;
      for(int i = 0; i < n; i++){
        if (max < Integer.parseInt(arr[i])){
          max = Integer.parseInt(arr[i]);
          maxIndex = i;
        }
      }
      System.out.println("Max value : " + max);
      int newMax = Integer.MIN_VALUE;
      for(int i = 0; i < arr.length; i++){
        if (maxIndex != i && newMax < Integer.parseInt(arr[i])){
          newMax = Integer.parseInt(arr[i]);
        }
      }
      System.out.println("New Max value : " + newMax);
      System.out.println((long) max * newMax);
      tests--;
    }
  }
}
