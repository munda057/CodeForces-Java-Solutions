import java.util.Scanner;

public class TL {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    int m = scanner.nextInt();
    int[] correct = new int[n];
    int[] wrong = new int[m];
    for (int i = 0; i < n; i++) {
      correct[i] += scanner.nextInt();
    }

    for (int i = 0; i < m; i++) {
      wrong[i] += scanner.nextInt();
    }

    int correctMin = Integer.MAX_VALUE;
    for (int i = 0; i < correct.length; i++) {
      if (correctMin > correct[i]) {
        correctMin = correct[i];
      }
    }

    int wrongMin = Integer.MAX_VALUE;
    for (int i = 0; i < wrong.length; i++) {
      if (wrongMin > wrong[i]) {
        wrongMin = wrong[i];
      }
    }

    if (correctMin * 2 > wrongMin) {
      System.out.println(-1);
    } else {
      int max = Integer.MIN_VALUE;
      for (int i = 0; i < correct.length; i++) {
        if (max < correct[i]) {
          max = correct[i];
        }
      }
      if (n == 1 && correctMin * 2 >= wrongMin){
        System.out.println(-1);
      }
      else if (n == 1 && wrongMin > correctMin * 2){
        System.out.println(correctMin*2);
      }
      else if (max < wrongMin && max > correctMin * 2) {
        System.out.println(max);
      }
      else if (max < wrongMin && correctMin * 2 < wrongMin && max <= correctMin * 2){
        System.out.println(correctMin * 2);
      }
      else {
        System.out.println(-1);
      }
    }
  }
}

