import java.util.Scanner;

public class LineBreak {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int tests = Integer.parseInt(scanner.nextLine());
    while (tests > 0){
      String[] arr = scanner.nextLine().split(" ");
      int n = Integer.parseInt(arr[0]);
      int m = Integer.parseInt(arr[1]);
      int sum = 0;
      int count = 0;
      int result = 0;
      boolean check = false;
      for(int i = 0; i < n; i++){
        sum += scanner.nextLine().length();
        count++;
        if(sum == m && !check) {
          result = count;
          check = true;
        }
        else if (sum > m && !check){
          count--;
          result = count;
          check = true;
        }
      }
      if (!check){
        System.out.println(count);
      }
      else {
        System.out.println(result);
      }
      tests--;
    }
  }
}
