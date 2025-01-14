import java.util.Arrays;
import java.util.Scanner;

public class CupBoards {
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    int tests = scanner.nextInt();
    int[] leftDoors = new int[tests];
    int[] rightDoors = new int[tests];
    for(int i = 0; i < tests; i++){
      leftDoors[i] = scanner.nextInt();
      rightDoors[i] =  scanner.nextInt();
    }
    int leftMajority = majorityNum(leftDoors);
    int toOpenCloseLeft = tests - leftMajority;
    int rightMajority = majorityNum(rightDoors);
    int toOpenCloseRight = tests - rightMajority;
    System.out.println(toOpenCloseRight + toOpenCloseLeft);
  }

  public static int majorityNum(int[] arr){
    int openCount = 0;
    int closeCount = 0;
    for(int i = 0; i < arr.length; i++){
      if (arr[i] == 1){
        openCount++;
      }
      else {
        closeCount++;
      }
    }
    if (openCount >= closeCount){
      return openCount;
    }
    else {
      return closeCount;
    }
  }
}
