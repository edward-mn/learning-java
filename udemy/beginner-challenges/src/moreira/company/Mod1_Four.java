package moreira.company;

import java.util.Locale;
import java.util.Scanner;

public class Mod1_Four {
  public static void main(String[] args) {
    Locale.setDefault(Locale.US); // Deve ser declarado antes do .in
    Scanner sc = new Scanner(System.in);

    System.out.println("Activite IV");
    int id, horas;
    double valorHora;

    id = sc.nextInt();
    horas = sc.nextInt();
    valorHora = sc.nextDouble();
    System.out.printf("Number %d \nSalary = U$ %.2f", id, (horas * valorHora));

    sc.close();
  }
}
