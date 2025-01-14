import java.beans.IntrospectionException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class StartUP {
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    int tests = Integer.parseInt(scanner.nextLine());

    while (tests > 0){
      int n = scanner.nextInt();
      int k = scanner.nextInt();
      int[] brandArr = new int[k];
      int[] costArr = new int[k];
      for (int i = 0; i < k; i++){
        brandArr[i] = scanner.nextInt();
        costArr[i] = scanner.nextInt();
      }
      HashMap<Integer, Integer> map = new HashMap<>();
      for(int i = 0; i < k; i++){
        if (!map.containsKey(brandArr[i])){
          map.put(brandArr[i], costArr[i]);
        }
        else {
          map.put(brandArr[i], map.get(brandArr[i]) + costArr[i]);
        }
      }
      int[] valueArr = new int[k];
      int a = 0;
      for (Map.Entry<Integer, Integer> m : map.entrySet()){
        valueArr[a] = m.getValue();
        a++;
      }
      Arrays.sort(valueArr);
      for(int i = 0; i < valueArr.length/2; i++){
        int temp = valueArr[i];
        valueArr[i] = valueArr[valueArr.length - 1 - i];
        valueArr[valueArr.length - i - 1] = temp;
      }
      int sum = 0;
      if (k < n){
        for(int i = 0; i < k; i++){
          sum += valueArr[i];
        }
      }
      else {
        for (int i = 0; i < n; i++){
          sum += valueArr[i];
        }
      }
      System.out.println(sum);
      tests--;
    }
  }
}
