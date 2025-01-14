import java.util.Scanner;

public class XeniaAndRingroad {
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    String[] given = scanner.nextLine().split(" ");
    int n = Integer.parseInt(given[0]);
    int m = Integer.parseInt(given[1]);
    String[] arr = scanner.nextLine().split(" ");
    long sum = 0;
    for(int i = 0; i < m; i++){
      if (i == 0){
        sum += Integer.parseInt(arr[i]) - 1;
      }
      else {
        if (Integer.parseInt(arr[i-1]) > Integer.parseInt(arr[i])){
          sum += n - Integer.parseInt(arr[i-1]) + Integer.parseInt(arr[i]);
        }
        else {
          sum += Integer.parseInt(arr[i]) - Integer.parseInt(arr[i-1]);
        }
      }
    }
    System.out.println(sum);
  }
}
