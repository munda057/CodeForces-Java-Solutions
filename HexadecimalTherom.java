import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class HexadecimalTherom {
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    int number = Integer.parseInt(scanner.nextLine());
    if (number == 1 || number == 0){
      System.out.println(number + " 0 0");
    }
    else {
      int n = 1;
      ArrayList<Integer> arr = new ArrayList<>();
      arr.add(0);
      arr.add(1);
      int i = 1;
      while (n < 1000000000){
        n = arr.get(i) + arr.get(i-1);
        arr.add(n);
        i++;
      }
      int index = 0;
      for(int j = 0; j < arr.size(); j++){
        if (arr.get(j) == number){
          index = j;
        }
      }
      int one = arr.get(index - 1);
      int two = arr.get(index - 2);

      int indexTwo = 0;
      for(int k = 0; k < arr.size(); k++){
        if (arr.get(k) == two){
          indexTwo = k;
        }
      }

      int three = arr.get(indexTwo - 1);
      int four = arr.get(indexTwo - 2);
      System.out.println(one + " " + three + " " + four);
    }
  }
}