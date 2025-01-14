import java.util.*;

public class ChatRoom {
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    String[] arr = scanner.nextLine().split("");
    int index = 0;
    String[] check = new String[] {"h","e","l","l","o"};
    boolean bool = false;
    for(int i = 0; i < arr.length; i++){
      if (arr[i].equals(check[index])){
        index++;
      }
      if (index == check.length){
        System.out.println("YES");
        bool = true;
        break;
      }
    }
    if (!bool){
      System.out.println("NO");
    }
  }
}
