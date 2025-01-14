import java.util.Scanner;

public class Army {
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    int[] arr = new int[n - 1];
    int[] rank = new int[2];
    for (int i = 0; i < arr.length; i++){
      arr[i] = scanner.nextInt();
    }

    for (int i = 0; i < rank.length; i++){
     rank[i] = scanner.nextInt();
    }

    int years = 0;
    for (int i = rank[0]; i < rank[1]; i++){
      years += arr[i - 1];
    }

    System.out.println(years);

  }
}
