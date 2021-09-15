package moreira.company;

import java.util.Scanner;

public class Ternario {
  public static void main(String[] args) {
    double preco = 34.5;
    double conta = (preco < 20.0) ? preco * 0.1 : preco * 0.05;

    System.out.println("Preço = " + conta);
  }
}
