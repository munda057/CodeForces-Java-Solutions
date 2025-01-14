import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class DimaAndFriends {
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    int numOfFriends = Integer.parseInt(scanner.nextLine());
    String[] fingers = scanner.nextLine().split(" ");
    HashMap<Integer, Integer> map = new HashMap<>();
    int totalFingers = 0;

    for(int i = 0; i < fingers.length; i++){
      totalFingers += Integer.parseInt(fingers[i]);
    }
    for(int i = 1; i <= 5; i++){
      map.put(i, i+totalFingers);
    }
    int count = 0;
    for(Map.Entry<Integer, Integer> m : map.entrySet()){
      if (!((m.getValue() - 1) % (numOfFriends + 1) == 0)){
        count++;
      }
    }
    System.out.println(count);
  }
}
