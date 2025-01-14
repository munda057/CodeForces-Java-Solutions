import java.util.Scanner;

public class I_LOVE_USERNAME {
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    int numOfContests = Integer.parseInt(scanner.nextLine());
    int[] arr = new int[numOfContests];
    for(int i = 0; i < numOfContests; i++){
      arr[i] = scanner.nextInt();
    }
    int amazingCount = 0;
    int moreThanCurrent = arr[0];
    int lessThanCurrent = arr[0];
    for(int i = 1; i < arr.length; i++){
      if (arr[i] > moreThanCurrent){
        amazingCount++;
        moreThanCurrent = arr[i];
      }
      if (arr[i] < lessThanCurrent){
        lessThanCurrent = arr[i];
        amazingCount++;
      }
    }
    System.out.println(amazingCount);

  }
}
