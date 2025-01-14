import java.util.Scanner;

public class GoodArray {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();  // Number of elements
    int[] num = new int[n];
    long totalSum = 0;

    // Read the input array and calculate the total sum
    for (int i = 0; i < n; i++) {
      num[i] = scanner.nextInt();
      totalSum += num[i];
    }

    int max1 = 0, max2 = 0, max1Index = -1;

    // Find max1 (largest) and max2 (second largest) elements
    for (int i = 0; i < n; i++) {
      if (num[i] > max1) {
        max2 = max1;
        max1 = num[i];
        max1Index = i;
      } else if (num[i] > max2) {
        max2 = num[i];
      }
    }

    StringBuilder result = new StringBuilder();
    int count = 0;

    // Check each index to see if it's a "good" index
    for (int i = 0; i < n; i++) {
      long remainingSum = totalSum - num[i];
      int targetMax = (i == max1Index) ? max2 : max1;

      if (remainingSum == 2L * targetMax) {
        result.append(i + 1).append(" ");
        count++;
      }
    }

    // Print the results
    System.out.println(count);
    if (count > 0) {
      System.out.println(result.toString().trim());
    }
  }
}
