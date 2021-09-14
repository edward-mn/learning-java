package moreira.company;

import java.util.Locale;
import java.util.Scanner;

public class Mod1_Three {

  public static void main(String[] args) {
    Locale.setDefault(Locale.US); // Deve ser declarado antes do .in
    Scanner sc = new Scanner(System.in);

    System.out.println("Activite III");

    int n1, n2, n3, n4, result;
    n1 = sc.nextInt();
    n2 = sc.nextInt();
    n3 = sc.nextInt();
    n4 = sc.nextInt();
    result = (n1 * n2 - n3 * n4);
    System.out.println("Diferença: " + result);

    sc.close();
  }
}
