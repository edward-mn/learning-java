package application;

import entities.Rectangle;

import java.util.Locale;
import java.util.Scanner;

public class mainRectangle {
  public static void main(String[] args) {
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);

    Rectangle oneRectangle = new Rectangle();

    System.out.println("Enter rectangle width and height");
    oneRectangle.width = sc.nextDouble();
    oneRectangle.height = sc.nextDouble();

    System.out.printf("AREA = %.2f%n", oneRectangle.area());
    System.out.printf("PERIMETER = %.2f%n", oneRectangle.perimeter());
    System.out.printf("DIAGONAL = %.2f%n", oneRectangle.diagonal());

    sc.close();
  }
}
