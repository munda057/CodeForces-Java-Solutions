import java.util.Scanner;

public class
APanoramixsPrediction {
  public static void main(String[] args){
    boolean check = false;
    Scanner scanner = new Scanner(System.in);
    String[] arr = scanner.nextLine().split(" ");
    int prime = Integer.parseInt(arr[0]);
    int toCheck = Integer.parseInt(arr[1]);
    for(int i = prime + 1; i < 50; i++){
      if (checkingPrime(i)){
        if (i > toCheck){
          System.out.println("NO");
          break;
        }
        else {
          System.out.println("YES");
          break;
        }
      }
    }
  }
  public static boolean checkingPrime(int numToCheck){
    for(int i = 2; i < numToCheck / 2; i++){
      if (numToCheck % i == 0){
        return false;
      }
    }
    return true;
  }
}
