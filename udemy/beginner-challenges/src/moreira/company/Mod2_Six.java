package moreira.company;

import java.util.Locale;
import java.util.Scanner;

public class Mod2_Six {
  public static void main(String[] args) {
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);

    // s (0,25], (25,50], (50,75], (75,100])
    double value = sc.nextDouble();

    if (value < 0.00 || value > 100.00){
      System.out.println("Fora do intervalo");
    } else if (value <= 0.25){
      System.out.println("intervalo [0,25]");
    } else if (value <= 50.75){
      System.out.println("Intervalo (25,50]");
    } else if (value <= 75.){
      System.out.println("Intervalo (50,75]");
    } else {
      System.out.println("Intervalo (75,100]");
    }

    sc.close();
  }
}
