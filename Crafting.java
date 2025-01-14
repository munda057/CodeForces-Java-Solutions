import java.util.Scanner;

public class Crafting {
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    int tests = scanner.nextInt();
    while (tests > 0){
      int n = scanner.nextInt();
      int[] mats = new int[n];
      int[] matsNeeded = new int[n];
      for (int i = 0; i < mats.length; i++){
        mats[i] = scanner.nextInt();
      }

      for (int i = 0; i < matsNeeded.length; i++){
        matsNeeded[i] = scanner.nextInt();
      }
      int[] difference = new int[n];
      for (int i = 0; i < mats.length; i++){
        difference[i] = mats[i] - matsNeeded[i];
      }

      int negAmount = 0;
      int diffIndex = 0;
      for (int i = 0; i < difference.length; i++){
        if (difference[i] < 0){
          negAmount += difference[i];
          diffIndex = i;
        }
      }

      boolean check = true;
      for (int i = 0; i < difference.length; i++){
        if (diffIndex != i){
          if (Math.abs(negAmount) > difference[i]){
            check = false;
            break;
          }
        }
      }
      if (check){
        System.out.println("YES");
      }
      else {
        System.out.println("NO");
      }

      tests--;
    }
  }
}
