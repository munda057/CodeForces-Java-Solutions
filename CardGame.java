import java.time.temporal.ChronoField;
import java.util.Scanner;

public class CardGame {
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    String trump = scanner.nextLine();
    String[] cards = scanner.nextLine().split(" ");
    String[] rank = {"6", "7", "8", "9", "T", "J", "Q", "K", "A"};

    int indexOne = 0;
    int indexTwo = 0;
    for (int i = 0; i < rank.length; i++){
      if (rank[i].equals(Character.toString(cards[0].charAt(0)))){
        indexOne = i;
      }
      if (rank[i].equals(Character.toString(cards[1].charAt(0)))){
        indexTwo = i;
      }
    }

    if (Character.toString(cards[0].charAt(1)).equals(trump) && Character.toString(cards[1].charAt(1)).equals(trump)){
      if (indexTwo > indexOne){
        System.out.println("NO");
      }
      else if (indexTwo < indexOne){
        System.out.println("YES");
      }
      else {
        System.out.println("NO");
      }
    }
    else if (Character.toString(cards[0].charAt(1)).equals(trump)){
      System.out.println("YES");
    }
    else if (Character.toString(cards[1].charAt(1)).equals(trump)){
      System.out.println("NO");
    }
    else {
      if (Character.toString(cards[0].charAt(1)).equals(Character.toString(cards[1].charAt(1)))){
        if (indexTwo > indexOne){
          System.out.println("NO");
        }
        else if (indexTwo < indexOne){
          System.out.println("YES");
        }
        else {
          System.out.println("NO");
        }
      }
      else {
        System.out.println("NO");
      }
    }

  }
}
