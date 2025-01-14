import java.util.Scanner;

public class Dubstep {
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    String input = scanner.nextLine();
    String result = input.replaceAll("WUB", " ").trim();
    result = result.replaceAll("\\s+", " ");
    System.out.println(result);
  }
}
