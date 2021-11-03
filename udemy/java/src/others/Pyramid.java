package others;

import java.util.Arrays;
import java.util.Scanner;

public class Pyramid {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Insira o número de filas: ");
    int numFilas = sc.nextInt();
    sc.close();

    System.out.println();
    for(int altura = 1; altura<=numFilas; altura++){
      //Espaços em branco
      for(int brancos = 1; brancos<=numFilas-altura; brancos++){
        System.out.print(" ");
      }

      //Asteriscos
      for(int asteristicos=1; asteristicos<=(altura*2)-1; asteristicos++){
        System.out.print("*");
      }
      System.out.println();
    }
  }
}
