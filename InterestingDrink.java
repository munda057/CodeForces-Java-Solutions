import java.util.Arrays;
import java.util.Scanner;

public class InterestingDrink {
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    int shops = scanner.nextInt();
    int[] shopsDrinks = new int[shops];
    for (int i = 0; i < shops; i++){
      shopsDrinks[i] = scanner.nextInt();
    }

    Arrays.sort(shopsDrinks);

    int days = scanner.nextInt();
    while (days > 0){
      long n = scanner.nextLong();
      int count = binarySearch(shopsDrinks, n);
      System.out.println(count);
      days--;
    }
  }

  public static int binarySearch(int[] arr , long n){
    int left = 0;
    int right = arr.length;
    while (left < right){
      int mid = left + (right - left) / 2;
      if (arr[mid] <= n){
        left = mid + 1;
      }
      else {
        right = mid;
      }
    }
    return left;
  }
}
