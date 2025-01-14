import java.util.Scanner;

public class Tram {
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    int stops = Integer.parseInt(scanner.nextLine());
    int currentPassengers = 0;
    int max = Integer.MIN_VALUE;
    for(int i = 0; i < stops; i++){
      int exits = scanner.nextInt();
      int enters = scanner.nextInt();
      currentPassengers = currentPassengers - exits;
      currentPassengers = currentPassengers + enters;
      if (currentPassengers > max){
        max = currentPassengers;
      }
    }
    System.out.println(max);
  }
}
