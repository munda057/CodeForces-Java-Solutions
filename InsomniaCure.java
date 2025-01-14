import java.util.Arrays;
import java.util.Scanner;

public class InsomniaCure {
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    int punched  = scanner.nextInt();
    int tailShut = scanner.nextInt();
    int pawnTramples = scanner.nextInt();
    int threatened = scanner.nextInt();
    int numDragons = scanner.nextInt();
    boolean[] dragonDamaged = new boolean[numDragons + 1];
    for(int i = 1; i < dragonDamaged.length; i++){
      if (i % punched == 0 || i % tailShut == 0 || i % pawnTramples == 0 || i % threatened == 0){
        dragonDamaged[i] = true;
      }
    }
    int count = 0;
    for (int i = 0; i < dragonDamaged.length; i++){
      if (dragonDamaged[i]){
        count++;
      }
    }
    System.out.println(count);
  }
}
