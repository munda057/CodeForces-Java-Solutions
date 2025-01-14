import java.util.Scanner;

public class LoveStory {
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    int numOfTest = Integer.parseInt(scanner.nextLine());
    String[] compareWord = {"c", "o", "d", "e", "f", "o", "r", "c", "e", "s"};
    while (numOfTest > 0){
      int count = 0;
      String[] arr = scanner.nextLine().split("");
      for(int i = 0; i < compareWord.length; i++){
        if (!arr[i].equals(compareWord[i])){
          count++;
        }
      }
      System.out.println(count);
      numOfTest--;
    }
  }
}
