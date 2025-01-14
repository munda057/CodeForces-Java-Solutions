import java.util.Scanner;

public class llyaAndQueriesDpApproachUsingPrefixSum {
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    String s = scanner.nextLine();
    int n = scanner.nextInt();
    int[] prefix = new int[s.length()];
    for (int i = 1; i < s.length(); i++){
      if (s.charAt(i) == s.charAt(i-1)){
        prefix[i] = prefix[i-1] + 1;
      }
      else {
        prefix[i] = prefix[i - 1];
      }
    }
    while (n > 0){
      int i = scanner.nextInt();
      int j = scanner.nextInt();
      int result = prefix[j - 1] - prefix[i - 1];
      System.out.println(result);
      n--;
    }
  }
}
