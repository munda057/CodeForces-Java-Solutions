import java.util.Scanner;

public class PreparingForTheOlympiad {
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    int tests = Integer.parseInt(scanner.nextLine());

    while(tests > 0){
      int arrSize = Integer.parseInt(scanner.nextLine());
      int[] arrOne = new int[arrSize];
      int[] arrTwo = new int[arrSize];

      String[] arr = scanner.nextLine().split(" ");
      for(int i = 0; i < arr.length; i++){
        arrOne[i] = Integer.parseInt(arr[i]);
      }

      String[] second = scanner.nextLine().split(" ");
      for(int j = 0; j < second.length; j++){
        arrTwo[j] = Integer.parseInt(second[j]);
      }

      int sumOne = 0;
      int sumTwo = 0;
      for(int j = 0; j < arrOne.length - 1; j++){
        if (arrOne[j] > arrTwo[j + 1]){
          sumOne += arrOne[j];
          sumTwo += arrTwo[j+1];
        }
      }
      sumOne += arrOne[arrOne.length - 1];
      System.out.println(sumOne - sumTwo);
      tests--;
    }
  }
}
