import java.util.HashSet;
import java.util.Scanner;

// This is a DP problem.

public class SerejaAndSuffixes {
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    int m = scanner.nextInt();
    int[] arr = new int[n];
    for (int i = 0; i < arr.length; i++){
      arr[i] = scanner.nextInt();
    }

    int[] dp = new int[n];
    dp[arr.length - 1] = 1;
    HashSet<Integer> set = new HashSet<>();
    set.add(arr[arr.length - 1]);
    for (int i = arr.length - 2; i >= 0; i--){
      if (!set.contains(arr[i])){
        dp[i] = dp[i + 1] + 1;
        set.add(arr[i]);
      }
      else {
        dp[i] = dp[i + 1];
      }
    }

    while (m > 0){
      int i = scanner.nextInt();
      System.out.println(dp[i - 1]);
      m--;
    }
  }
}


// Step 1 Define DP :- In this case at our dp array dp[i] means the number of distinct elements in the array starting at index i.
// Step 2 Traversal :- We traverse the array from right to left.
// NOT NORMAL :- Step 3 HashSet to maintain unique elements.
// Step 4 :- Print the answer as dp[i] with i being the query where we start our index from.
