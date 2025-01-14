import java.util.HashMap;
import java.util.Scanner;

public class IsYourHorseShoeOnTheOtherHoof {
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    String[] shoes = scanner.nextLine().split(" ");
    HashMap<String, Integer> map = new HashMap<>();
    int count = 0;
    for(int i = 0; i < shoes.length; i++){
      if (!map.containsKey(shoes[i])){
        map.put(shoes[i] , 1);
      }
      else {
        map.put(shoes[i], map.get(shoes[i]) + 1);
        count++;
      }
    }
    System.out.println(count);
  }
}
