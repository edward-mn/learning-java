package application;

import entities.Product;

import java.util.Locale;
import java.util.Scanner;

public class mainProduct {
  public static void main(String[] args) {
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);

    Product product = new Product();
    System.out.println("Enter product data");
    System.out.print("Name: ");
    product.name = sc.next();
    System.out.print("Price: ");
    product.price = sc.nextDouble();
    System.out.print("Quantity in Stock: ");
    product.quantity = sc.nextInt();

    System.out.println(product.name + ',' + product.price + ',' + product.quantity);
    sc.close();
  }
}
