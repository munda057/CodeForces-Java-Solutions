import java.util.Scanner;

public class LittleElephantAndRozdil {
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    int cities = Integer.parseInt(scanner.nextLine());
    String[] arr = scanner.nextLine().split(" ");
    int min = Integer.MAX_VALUE;
    int minIndex = 0;
    for(int i = 0; i < cities; i++){
      if (min > Integer.parseInt(arr[i])){
        min = Integer.parseInt(arr[i]);
        minIndex = i;
      }
    }

    int count = 0;
    for(int i = 0; i < arr.length; i++){
     if (Integer.parseInt(arr[i]) == min){
       count++;
     }
    }

    if (count > 1){
      System.out.println("Still Rozdil");
    }
    else {
      System.out.println(minIndex + 1);
    }

  }
}
