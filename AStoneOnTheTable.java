import java.util.Scanner;

public class AStoneOnTheTable {
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    int numOfStones = Integer.parseInt(scanner.nextLine());
    String[] stones = scanner.nextLine().split("");
    int count = 0;
    for(int i = 0; i < numOfStones - 1; i++){
      if (stones[i].equals(stones[i+1])){
        count++;
      }
    }
    System.out.println(count);
  }
}
