package moreira.company;

import java.util.Locale;
import java.util.Scanner;

public class Mod2_Five {
  public static void main(String[] args) {
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);

    int cod = sc.nextInt();
    int qtd = sc.nextInt();
    double value;
    switch (cod){
      case 1:
        value = 4.00;
        break;
      case 2:
        value = 4.50;
        break;
      case 3:
        value = 5.00;
        break;
      case 4:
        value = 2.00;
        break;
      case 5:
        value = 1.50;
        break;
      default:
        value = 0.00;
        break;
    }

    System.out.printf("Total = %.2f", qtd * value);
    sc.close();
  }
}
