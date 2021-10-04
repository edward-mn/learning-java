package application;

import entities.Employee;

import java.util.Locale;
import java.util.Scanner;

public class mainEmployee {
  public static void main(String[] args) {
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);

    Employee people = new Employee();
    System.out.print("Name: ");
    people.name = sc.next();

    System.out.print("Gross salary: ");
    people.grossSalary = sc.nextDouble();

    System.out.print("Tax of salary: ");
    people.tax = sc.nextDouble();

    System.out.printf(people.toString());

    System.out.print("Which percentage to increase salary? ");
    people.increaseSalary(sc.nextDouble());

    System.out.printf(people.toString());
  }
}
