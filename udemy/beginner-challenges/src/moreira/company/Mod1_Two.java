package moreira.company;

import java.util.Locale;
import java.util.Scanner;

public class Mod1_Two {

  public static void main(String[] args) {
    Locale.setDefault(Locale.US); // Deve ser declarado antes do .in
    Scanner sc = new Scanner(System.in);

    System.out.println("Activite II");
    double raio, result, PI = 3.14159;

    raio = sc.nextDouble();
    result =  PI * Math.pow(raio, 2.0);
    System.out.printf("Raio do círculo foi: %.4f", result);

    sc.close();
  }
}
