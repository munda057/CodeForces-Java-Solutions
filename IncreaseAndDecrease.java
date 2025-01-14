import java.util.Scanner;

public class IncreaseAndDecrease {
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    int n = Integer.parseInt(scanner.nextLine());
    String[] arr = scanner.nextLine().split(" ");
    int sum = 0;
    for(int i = 0; i < arr.length; i++){
      sum += Integer.parseInt(arr[i]);
    }

    if (sum % n == 0){
      System.out.println(n);
    }
    else{
      System.out.println(n - 1);
    }
  }
}
