import java.util.Scanner;

public class LightsOut {
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    int[][] array = new int[3][3];
    for(int i = 0; i < array.length; i++){
      for(int j = 0; j < array.length;j++){
        array[i][j] = 1;
      }
    }

    int[][] currentArr = new int[3][3];
    for(int i = 0; i < currentArr.length; i++){
       for (int j = 0; j < currentArr.length; j++){
         currentArr[i][j] = scanner.nextInt();
       }
    }

    for(int i = 0; i < currentArr.length; i++){
      for(int j = 0; j < currentArr.length; j++){
        if (currentArr[i][j] % 2 == 1){
          array[i][j] = toggle(array[i][j]);
          if (i < 2){
            array[i+1][j] = toggle(array[i+1][j]);
          }
          if (i > 0){
            array[i-1][j] = toggle(array[i-1][j]);
          }
          if (j < 2){
            array[i][j+1] = toggle(array[i][j+1]);
          }
          if (j > 0){
            array[i][j-1] = toggle(array[i][j-1]);
          }
        }
      }
    }

    for(int i = 0; i < currentArr.length; i++){
      for(int j = 0; j < currentArr.length; j++){
        System.out.print(array[i][j]);
      }
      System.out.println();
    }
  }

  public static int toggle(int button){
    if (button == 0){
      return 1;
    }
    else {
      return 0;
    }
  }
}
