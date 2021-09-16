package moreira.company;

import java.util.Scanner;

public class Mod3_One {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int ano = sc.nextInt();

    while(ano != 2002){
      System.out.println("Senha Inválida");
      ano = sc.nextInt();
    }

    System.out.println("Acesso permitido");
    sc.close();
  }
}
