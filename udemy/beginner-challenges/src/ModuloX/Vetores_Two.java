package ModuloX;

import Entities.Product;

import java.util.Locale;
import java.util.Scanner;

public class Vetores_Two {
  public static void main(String[] args) {
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);

    System.out.print("Insert array's lenght : ");
    int n = sc.nextInt();
    Product[] products = new Product[n];
    double average = 0.0;

    for (int i = 0; i < products.length; i++){
      sc.nextLine();
      String name = sc.nextLine();
      double price = sc.nextDouble();
      products[i] = new Product(name, price);
      average += products[i].getPrice();
    }

    System.out.printf("Average Price = %.2f%n", average / products.length);
  }
}
