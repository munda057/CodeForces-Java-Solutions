import java.util.Scanner;

public class PanoramixPrediction {
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    int currentPrime = scanner.nextInt();
    int nextPrime = scanner.nextInt();
    if (!checkIfPrime(nextPrime)){
      System.out.println("NO");
    }
    else {
      for(int i = currentPrime + 1; i < nextPrime + 1; i++){
        if (checkIfPrime(i)){
          if (i != nextPrime){
            System.out.println("NO");
            break;
          }
          else {
            System.out.println("YES");
          }
        }
      }
    }
  }
  public static boolean checkIfPrime(int num){
    for(int i = 2; i < num; i++){
      if (num % i == 0){
        return false;
      }
    }
    return true;
  }
}
