import java.util.Arrays;
import java.util.Scanner;

public class BQueueAtTheSchool {
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    String[] arr = scanner.nextLine().split(" ");
    String[] stringInput = scanner.nextLine().split("");
    int numOfStudents = Integer.parseInt(arr[0]);
    int time = Integer.parseInt(arr[1]);
    while (time > 0){
      for (int i = 1; i < numOfStudents; i++) {
        if (stringInput[i - 1].equals("B") && stringInput[i].equals("G")) {
          String temp = stringInput[i - 1];
          stringInput[i - 1] = stringInput[i];
          stringInput[i] = temp;
          i++;
        }
      }
      time--;
    }
    String result = "";
    for(int i = 0; i < stringInput.length; i++){
      result += stringInput[i];
    }
    System.out.println(result);
  }
}
