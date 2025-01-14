import java.util.Scanner;

public class RoadsideTrees {
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    int numOfTrees = scanner.nextInt();
    int[] trees = new int[numOfTrees];
    for (int i = 0; i < numOfTrees; i++){
      trees[i] = scanner.nextInt();
    }

    int time = 0;
    int height = 0;

    for (int i = 0; i < trees.length; i++) {
      time += Math.abs(trees[i] - height);
      height = trees[i];
      time += 1;
      if (i < trees.length - 1) {
        time += 1;
      }
    }
    System.out.println(time);
  }
}
