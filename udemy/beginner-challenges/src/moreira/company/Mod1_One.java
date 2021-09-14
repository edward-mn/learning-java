package moreira.company;

import java.util.Locale;
import java.util.Scanner;

public class Mod1_One {

  public static void main(String[] args) {
    Locale.setDefault(Locale.US); // Deve ser declarado antes do .in
    Scanner sc = new Scanner(System.in);

    System.out.println("Activite I");
    int n1, n2;
    System.out.println("Insira 2 valores");

    n1 = sc.nextInt();
    n2 = sc.nextInt();
    System.out.println("Soma = " + (n1+n2));
    sc.close();
  }
}
