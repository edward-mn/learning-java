package moreira.company;

import java.util.Locale;
import java.util.Scanner;

public class Mod4_Three {
  public static void main(String[] args) {
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);
    System.out.println("Quantidade de números");
    int n = sc.nextInt();

    System.out.println("Números");
    for(int i = 0; i < n; i++){
      double n1 = sc.nextDouble();
      double n2 = sc.nextDouble();
      double n3 = sc.nextDouble();
      double media = (n1 * 2.0 + n2 * 3.0 + n3 * 5.0) / (2 + 3 + 5);
      System.out.printf("%.1f%n", media);
    }

    sc.close();
  }
}
