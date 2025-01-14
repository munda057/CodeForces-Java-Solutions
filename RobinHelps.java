import java.util.Scanner;

public class RobinHelps {
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    int tests = scanner.nextInt();

    while (tests > 0){
      int numOfPeople = scanner.nextInt();
      int threshold = scanner.nextInt();
      int currGold = 0;
      int count = 0;
      for(int i = 0; i < numOfPeople; i++){
        int nextGold = scanner.nextInt();
        if (threshold <= nextGold){
          currGold += nextGold;
        }
        else if (nextGold == 0 && currGold > 0){
          currGold--;
          count++;
        }
      }
      System.out.println(count);
      tests--;
    }
  }
}
