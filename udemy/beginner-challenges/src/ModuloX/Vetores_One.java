package ModuloX;

import java.util.Locale;
import java.util.Scanner;

public class Vetores_One {
  public static void main(String[] args) {
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);

    System.out.print("Insert lenght of array: ");
    int n = sc.nextInt();
    double[] grades = new double[n];
    double average = 0.0;

    for(int i = 0; i < n; i++){
      grades[i] = sc.nextDouble();
      average += grades[i];
    }

    System.out.printf("Average Height: %.2f%n", average / 3.0);
  }
}
