import java.util.Map;
import java.util.Scanner;

public class ArrivalOfGeneral {
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    int squadCount = Integer.parseInt(scanner.nextLine());
    String[] arr = scanner.nextLine().split(" ");

    int min = Integer.MAX_VALUE;
    int minIndex = 0;
    int max = Integer.MIN_VALUE;
    int maxIndex = 0;

    for(int i = 0; i < squadCount; i++){
      if (min >= Integer.parseInt(arr[i])){
        min = Integer.parseInt(arr[i]);
        minIndex = i;
      }
    }

    for(int i = 0; i < squadCount; i++){
      if (max < Integer.parseInt(arr[i])){
        max = Integer.parseInt(arr[i]);
        maxIndex = i;
      }
    }

    int count = 0;
    if (minIndex < maxIndex){
      count--;
    }

    int result = Math.abs(- maxIndex) + (arr.length - 1 - minIndex) + count;

    System.out.println(result);
  }
}
