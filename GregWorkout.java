import javax.management.ObjectName;
import java.util.Scanner;

public class GregWorkout {
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    int test = scanner.nextInt();
    int[] arr = new int[test];
    for (int i = 0; i < test; i++){
      arr[i] = scanner.nextInt();
    }

    int chest = 0;
    int back = 0;
    int bicept = 0;
    if (test == 1){
      chest = arr[0];
    }
    else if(test == 2){
      chest += arr[0];
      bicept += arr[1];
    }
    else {
      for (int i = 0; i < arr.length - 2; i+=3){
        chest += arr[i];
        bicept+= arr[i+1];
        back += arr[i+2];
      }
      int rest = arr.length % 3;
      if (rest == 1){
        chest += arr[arr.length - 1];
      }
      else if (rest == 2){
        chest += arr[arr.length - 2];
        bicept += arr[arr.length - 1];
      }
    }

    if (chest > bicept && chest > back){
      System.out.println("chest");
    }
    else if (bicept > chest && bicept > back){
      System.out.println("biceps");
    }
    else {
      System.out.println("back");
    }
  }
}
