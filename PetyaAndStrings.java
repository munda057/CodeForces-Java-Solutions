import java.util.Scanner;

public class PetyaAndStrings {
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    String lineOne = scanner.nextLine();
    String lineTwo = scanner.nextLine();
    lineOne = lineOne.toLowerCase();
    lineTwo = lineTwo.toLowerCase();
    if (lineOne.equals(lineTwo)){
      System.out.println(0);
    }
    else {
      int count = 0;
      for(int i = 0; i < lineOne.length(); i++){
        if ((int)lineOne.charAt(i) < (int) lineTwo.charAt(i)){
          System.out.println(-1);
          break;
        } else if ((int)lineOne.charAt(i) > (int) lineTwo.charAt(i)){
          System.out.println(1);
          break;
        }
        else {
          count++;
        }
      }
      if (count == lineTwo.length()){
        System.out.println(0);
      }
    }
  }
}