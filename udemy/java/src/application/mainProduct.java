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

    char resp;
    do{
      System.out.println("Adicionar no Estoque , Remover do Estoque");
      product.wantContinue(sc.nextInt(), sc.nextInt());
      resp = sc.next().charAt(0);
    } while (resp != 'n');

    sc.close();
  }
}
