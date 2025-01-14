import java.util.Scanner;

public class PetrAndBook {
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    int numOfPages = Integer.parseInt(scanner.nextLine());
    String[] pagesPerDay = scanner.nextLine().split(" ");
    int pagesSoFar = 0;
    int n = 0;
    boolean check = false;
    while (n < 10000){
      for(int i = 0; i < 7; i++){
        pagesSoFar += Integer.parseInt(pagesPerDay[i]);
        if (numOfPages <= pagesSoFar){
          System.out.println(i+1);
          check = true;
          break;
        }
      }
      if (check){
        break;
      }
      n++;
    }
    if (pagesSoFar < numOfPages){
      System.out.println("here" + 1);
    }
  }
}
//  public static boolean containsPage(int soFar, int next, int numOfPages){
//    if (soFar < numOfPages && soFar + next > numOfPages){
//      return true;
//    }
//    return false;
//  }

