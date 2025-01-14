import java.util.Arrays;
import java.util.Scanner;

public class KuriyamaMiraisStone {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    long[] vArr = new long[n];
    long[] sortedArr = new long[n];

    for (int i = 0; i < n; i++) {
      vArr[i] = scanner.nextLong();
      sortedArr[i] = vArr[i];
    }

    Arrays.sort(sortedArr);

    long[] prefixSum = new long[n + 1];
    long[] prefixSumSorted = new long[n + 1];

    for (int i = 1; i <= n; i++) {
      prefixSum[i] = prefixSum[i - 1] + vArr[i - 1];
      prefixSumSorted[i] = prefixSumSorted[i - 1] + sortedArr[i - 1];
    }

    int q = scanner.nextInt();
    while (q-- > 0) {
      int type = scanner.nextInt();
      int l = scanner.nextInt();
      int r = scanner.nextInt();

      long result;
      if (type == 1) {
        result = prefixSum[r] - prefixSum[l - 1];
      } else {
        result = prefixSumSorted[r] - prefixSumSorted[l - 1];
      }
      System.out.println(result);
    }
  }
}