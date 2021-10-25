package ModuloX;

import java.util.Scanner;

public class Matriz {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Insert numbers of Column and Row");
    int qtdColumn = sc.nextInt();
    int qtdRow = sc.nextInt();

    int [][] matriz = new int[qtdColumn][qtdRow];

    for(int column = 0; column < matriz.length; column++){
      for(int row = 0; row < matriz[column].length; row++){
        matriz[column][row] = sc.nextInt();
      }
    }

    int findNumber = sc.nextInt();
    for(int column = 0; column < matriz.length; column++){
      for(int row = 0; row < matriz[column].length; row++){
        if(matriz[column][row] == findNumber){
          System.out.println("Position [" + column + "][" + row + "]:");
          if (row > 0) {
            System.out.println("Left: " + matriz[column][row-1]);
          }
          if (column > 0) {
            System.out.println("Up: " + matriz[column-1][row]);
          }
          if (row < matriz[column].length-1) {
            System.out.println("Right: " + matriz[column][row+1]);
          }
          if (column < matriz.length-1) {
            System.out.println("Down: " + matriz[column+1][row]);
          }
        }
      }

      sc.close();
    }
  }
}
