package moreira.company;

import java.util.Scanner;

public class Mod3_Three {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int listaProdutos = sc.nextInt();
    int Alcool = 0;
    int Gasolina = 0;
    int Diesel = 0;

    while (listaProdutos != 4) {
      switch (listaProdutos) {
        case 1:
          Alcool++;
          break;
        case 2:
          Gasolina++;
          break;
        case 3:
          Diesel++;
          break;
        default:
          System.out.println("Opção inválida");
          break;
      }
      System.out.println("1.Álcool - 2.Gasolina - 3.Diesel - 4.Fim");
      listaProdutos = sc.nextInt();
    }

    System.out.println("Muito obrigado! \nÁlcool:" + Alcool + "\nGasolina:" + Gasolina + "\nDiesel:" + Diesel);
  }
}
