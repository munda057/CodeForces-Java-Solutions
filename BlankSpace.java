import java.util.Scanner;

public class BlankSpace {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int numOfTest = Integer.parseInt(scanner.nextLine());
    while(numOfTest > 0){
      int amount = Integer.parseInt(scanner.nextLine());
      String[] arr = scanner.nextLine().split(" ");
      System.out.println(inRow(arr));
      numOfTest--;
    }
  }
  public static int inRow(String[] array){
    int currNumZeros = 0;
    int maxZeros = -1;
    for(int i = 0; i < array.length; i++){
      if (array[i].equals("0")){
        currNumZeros++;
      }
      else {
        if (currNumZeros > maxZeros){
          maxZeros = currNumZeros;
        }
        currNumZeros = 0;
      }
    }
    if (currNumZeros > maxZeros) {
      maxZeros = currNumZeros;
    }
    return maxZeros;
  }
}
