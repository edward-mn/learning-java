package moreira.company;

import java.util.Locale;
import java.util.Scanner;

public class Mod1_Five {

  public static void main(String[] args) {
    Locale.setDefault(Locale.US); // Deve ser declarado antes do .in
    Scanner sc = new Scanner(System.in);

    System.out.println("Activite V");
    int numberPeca1, qtdPeca1, numberPeca2, qtdPeca2;
    double valorPeca1, valorPeca2;
    numberPeca1 = sc.nextInt();
    qtdPeca1 = sc.nextInt();
    valorPeca1 = sc.nextDouble();
    numberPeca2 = sc.nextInt();
    qtdPeca2 = sc.nextInt();
    valorPeca2 = sc.nextDouble();
    System.out.printf("Valor a Pagar = R$ %.2f", (qtdPeca1 * valorPeca1 + qtdPeca2 * valorPeca2));

    sc.close();
  }
}
