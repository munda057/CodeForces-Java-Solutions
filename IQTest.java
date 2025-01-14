import java.util.Scanner;

public class IQTest {
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    int[] arr = new int[n];
    for (int i = 0; i < arr.length; i++){
      arr[i] = scanner.nextInt();
    }

    boolean[] check = new boolean[n];

    int count = 0;
    for (int i = 0; i < arr.length; i++){
      if (arr[i] % 2 == 0){
        check[i] = true;
        count++;
      }
      else {
        check[i] = false;
      }
    }

    if (count == 1){
      for (int i = 0; i < check.length; i++){
        if (check[i]){
          System.out.println(i + 1);
          break;
        }
      }
    }
    else {
      for (int i = 0; i < check.length; i++){
        if (!check[i]){
          System.out.println(i + 1);
          break;
        }
      }
    }
  }
}
