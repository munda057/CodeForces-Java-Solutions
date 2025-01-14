import java.util.Scanner;

public class SoftDrink {
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    int friends = scanner.nextInt();
    int bottles = scanner.nextInt();
    int milliliters = scanner.nextInt();
    int limes = scanner.nextInt();
    int slices = scanner.nextInt();
    int salt = scanner.nextInt();
    int millimitersNeeded = scanner.nextInt();
    int saltNeeded = scanner.nextInt();

    int totalDrink = bottles * milliliters;
    int toastFromDrinks = totalDrink / millimitersNeeded;
    int toastFromLimes = limes * slices;
    int saltGrams = salt / saltNeeded;

    System.out.println(Math.min(Math.min(toastFromDrinks, toastFromLimes), saltGrams) / friends);
  }
}
