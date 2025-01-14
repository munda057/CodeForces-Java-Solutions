import java.awt.image.AffineTransformOp;
import java.util.Scanner;

public class RudolfAndTheTicket {
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    int tests = scanner.nextInt();
     while (tests > 0){
       int n = scanner.nextInt();
       int m = scanner.nextInt();
       int k = scanner.nextInt();
       int[] arr = new int[n];
       int[] secondArr = new int[m];
       for (int i = 0; i < arr.length; i++){
         arr[i] = scanner.nextInt();
       }
       for (int j = 0; j < m; j++){
         secondArr[j] = scanner.nextInt();
       }

       int count = 0;
       for (int i = 0; i < arr.length; i++){
         for (int j = 0; j < m; j++){
           if (arr[i] + secondArr[j] <= k){
             count++;
           }
         }
       }
       System.out.println(count);
       tests--;
     }
  }
}