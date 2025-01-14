import java.util.Scanner;

public class PashmakAndFlowers {
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    long tests = Integer.parseInt(scanner.nextLine());
    long[] arr = new long[(int) tests];
    for(int i = 0; i < tests; i++){
      arr[i] = scanner.nextInt();
    }

    long min = Long.MAX_VALUE;
    long max = Long.MIN_VALUE;
    for (long j : arr) {
      if (j > max) {
        max = j;
      }
      if (j < min) {
        min = j;
      }
    }
    long diff = max - min;
    long countMin = 0;
    long countMax = 0;
    for(int i = 0; i < arr.length; i++){
      if(arr[i] == min){
        countMin++;
      }
      if (arr[i] == max){
        countMax++;
      }
    }

    if(min - max == 0){
      System.out.println(diff + " " + tests * (tests - 1)/2);
    }
    else {
      System.out.println(diff + " " + countMin * countMax);
    }
  }
}
