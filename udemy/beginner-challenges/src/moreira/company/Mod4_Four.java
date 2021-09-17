package moreira.company;

import java.util.Scanner;

public class Mod4_Four {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Quantidade de números");
    int n = sc.nextInt();

    System.out.println("Números");
    for(int i = 0; i < n; i++){
      int nominador = sc.nextInt();
      int denominador = sc.nextInt();

      if(denominador != 0){
        System.out.printf("%.1f%n", (double) nominador / denominador);
      } else {
        System.out.println("Divisão Impossível");
      }
    }

    sc.close();
  }
}
