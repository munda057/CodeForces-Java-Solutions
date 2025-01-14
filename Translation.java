import java.util.Scanner;

public class Translation {
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    String[] word = scanner.nextLine().split("");
    String toCheck = scanner.nextLine();
    for(int i = 0; i < word.length / 2; i++){
      String temp = word[i];
      word[i] = word[word.length - 1 - i];
      word[word.length - 1 - i] = temp;
    }
    StringBuilder result = new StringBuilder();
    for (String s : word) {
      result.append(s);
    }
    if (result.toString().equals(toCheck)){
      System.out.println("YES");
    }
    else {
      System.out.println("NO");
    }
  }
}
