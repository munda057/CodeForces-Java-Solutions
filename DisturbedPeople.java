import java.util.Scanner;

public class DisturbedPeople{
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    int tests = Integer.parseInt(scanner.nextLine());
    String[] arr = scanner.nextLine().split(" ");
    int count = 0;
     for(int i = 1; i < tests - 1; i++){
       if (arr[i].equals("0") && arr[i-1].equals("1") && arr[i+1].equals("1")){
         count++;
         arr[i+1] = "0";
       }
     }
    System.out.println(count);
  }

}