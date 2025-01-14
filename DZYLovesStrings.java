import java.util.Scanner;

public class DZYLovesStrings {
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    String s = scanner.nextLine();
    int len = Integer.parseInt(scanner.nextLine());
    int[] vals = new int[26];
    for (int i = 0; i < vals.length; i++){
      vals[i] = scanner.nextInt();
    }

    int max = Integer.MIN_VALUE;
    int index = 0;
    for (int i = 0; i < vals.length; i++){
      if (vals[i] > max){
        max = vals[i];
        index = i;
      }
    }

    for (int i = 0; i < len; i++){
      s += (char)('a' + index);
    }

    int sum = 0;
    for (int i = 0; i < s.length(); i++){
        sum += vals[s.charAt(i) - 'a'] * (i + 1);
    }

    System.out.println(sum);

  }
}