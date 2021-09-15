package moreira.company;

import java.util.Locale;
import java.util.Scanner;

public class Plano_Celular {
  public static void main(String[] args) {
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);

    int minutos = sc.nextInt();

    double conta = 50.0;
    if(minutos > 100){
      conta += (minutos - 100) * 2.0;
    }
  }
}
