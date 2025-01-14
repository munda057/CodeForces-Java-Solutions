import java.util.Scanner;

public class PenchickAndModernMonument {
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    int cases = Integer.parseInt(scanner.nextLine());
    while (cases > 0){
      int numOfPillar = Integer.parseInt(scanner.nextLine());
      int count = 0;
      int[] arr = new int[numOfPillar];
      String[] array = scanner.nextLine().split(" ");
      for(int i = 0; i < array.length; i++){
        int pillarOne = Integer.parseInt(array[i]);
        arr[i] = pillarOne;
      }
      for(int i = 0; i < arr.length - 1; i++){
        if (arr[i] > arr[i+1]){
          count++;
        }
      }
      System.out.println(count);
      cases--;
    }

  }
}
