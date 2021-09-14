package moreira.company;

import java.util.Locale;
import java.util.Scanner;

public class Mod2_Eight {
  public static void main(String[] args) {
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);

    double salary = sc.nextDouble();
    double imposto = 0.0;


    if(salary <= 2000.00){
      imposto = 0.0;
    } else if(salary <= 3000.00){
      imposto = (salary - 2000.00) * 0.08;
    } else if(salary <= 4500.00){
      imposto = (salary - 3000.00) * 0.18 + 1000.00 * 0.08;
    } else {
      imposto = (salary - 45000.00) * 0.28 + 1500.0 * 0.18 + 1000.0 * 0.08;
    }

    if( imposto == 0.0){
      System.out.println("Isento");
    } else {
      System.out.printf("Imposto R$: %.2f", imposto);
    }

    sc.close();
  }
}
