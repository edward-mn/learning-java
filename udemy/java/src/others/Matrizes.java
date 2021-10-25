package others;

import java.util.Scanner;

public class Matrizes {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    int negativeNumbers = 0;
    int [][] matriz = new int[n][n];

    for(int column = 0; column < matriz.length; column++){
      for(int row = 0; row < matriz[column].length; row++){
        matriz[column][row] = sc.nextInt();
        if (matriz[column][row] < 0){
          negativeNumbers++ ;
        }
      }
    }

    System.out.println("Main diagonal: ");
    for(int column = 0; column < matriz.length; column++){
      System.out.print(matriz[column][column] + " ");
    }

    System.out.println("\nNegative number = " + negativeNumbers);

    sc.close();
  }
}
