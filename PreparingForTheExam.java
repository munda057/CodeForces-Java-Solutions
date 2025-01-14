import java.util.*;

public class PreparingForTheExam {
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    int tests = Integer.parseInt(scanner.nextLine());
    while (tests > 0){
      String[] arr = scanner.nextLine().split(" ");
      HashSet<Integer> set = new HashSet<>();
      int n = Integer.parseInt(arr[0]);
      int m = Integer.parseInt(arr[1]);
      int k = Integer.parseInt(arr[2]);
      int[] mIntegers = new int[m];
      int[] kIntegers = new int[k];
      String[] mString = scanner.nextLine().split(" ");
      for(int i = 0; i < mIntegers.length; i++){
        mIntegers[i] = Integer.parseInt(mString[i]);
      }
      String[] kString = scanner.nextLine().split(" ");
      for(int i = 0; i < kIntegers.length; i++){
        kIntegers[i] = Integer.parseInt(kString[i]);
        set.add(kIntegers[i]);
      }
      if (n != m){
        for (int i = 0; i < mIntegers.length; i++){
          System.out.print(0);
        }
        System.out.println();
      }
      else {
        if (Arrays.equals(mIntegers, kIntegers)){
          for (int i = 0; i < mIntegers.length; i++){
            System.out.print(1);
          }
          System.out.println();
        }
        else {
          Integer[] myArray = new Integer[m];
          for (int i = 0; i < m; i++) {
            myArray[i] = mIntegers[i];
          }

          List<List<Integer>> result = getCombinations(myArray, k);
          boolean check = false;
          for (List<Integer> combination : result) {
            check = false;
            for(int i = 0; i < combination.size(); i++){
              if(!set.contains(combination.get(i))){
                System.out.print(0);
                check = true;
                break;
              }
            }
            if (!check){
              System.out.print(1);
            }
          }
          System.out.println();
        }
      }
      tests--;
    }
  }

  public static <T> List<List<T>> getCombinations(T[] input, int r) {
    List<List<T>> combinations = new ArrayList<>();
    generateCombinations(input, r, 0, new ArrayList<>(), combinations);
    return combinations;
  }

  private static <T> void generateCombinations(T[] input, int r, int index,
                                               List<T> current, List<List<T>> combinations) {
    if (current.size() == r) {
      combinations.add(new ArrayList<>(current));
      return;
    }

    for (int i = index; i < input.length; i++) {
      current.add(input[i]);
      generateCombinations(input, r, i + 1, current, combinations);
      current.remove(current.size() - 1); // Backtrack
    }
  }
}
