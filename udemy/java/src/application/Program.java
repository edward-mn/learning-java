package application;

import entities.Triangle;

import java.util.Locale;
import java.util.Scanner;

public class Program {
  public static void main(String[] args) {
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);

    Triangle firstTri, secondTri, last;
    firstTri = new Triangle();
    secondTri = new Triangle();
    last = new Triangle();

    System.out.println("enter the measures of triangle X:");
    firstTri.a = sc.nextDouble();
    firstTri.b = sc.nextDouble();
    firstTri.c = sc.nextDouble();

    System.out.println("enter the measures of triangle Y:");
    secondTri.a = sc.nextDouble();
    secondTri.b = sc.nextDouble();
    secondTri.c = sc.nextDouble();

    double areaX = firstTri.area();
    double areaY = secondTri.area();

    System.out.printf("Triangle X area: %.4f%n", areaX);
    System.out.printf("Triangle Y area: %.4f%n", areaY);

    System.out.println(last.bigger(areaX, areaY));

    sc.close();
  }
}
