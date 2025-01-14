import java.util.Scanner;

public class Team {
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    int numLines = Integer.parseInt(scanner.nextLine());
    int finalCount = 0;
    while (numLines > 0){
      String[] line = scanner.nextLine().split(" ");
      int count = 0;
      for(int i = 0; i < line.length; i++){
        if (line[i].equals("1")){
          count++;
        }
      }
      if (count >= 2){
        finalCount++;
      }
      numLines--;
    }
    System.out.println(finalCount);
  }
}
