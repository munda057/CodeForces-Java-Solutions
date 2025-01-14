import java.util.HashMap;
import java.util.Scanner;

public class EffectiveApproach {
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    int numOfElements = scanner.nextInt();
    int[] arr = new int[numOfElements + 1];
    HashMap<Integer, Integer> index = new HashMap<>();

    for(int i = 1; i <= numOfElements; i++){
      arr[i] = scanner.nextInt();
      index.put(arr[i], i);
    }

    int numOfChecks = scanner.nextInt();
    int indexOne = 0;
    int indexTwo = 0;
    for(int i = 0; i < numOfChecks; i++){
      int toCheck = scanner.nextInt();
      indexOne += index.get(toCheck);
      indexTwo += numOfElements - index.get(toCheck) + 1;
    }
    System.out.println(indexOne + " " + indexTwo);
  }
}

