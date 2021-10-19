package application;

import entities.ListEmployee;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class mainListEmployee {
  public static void main(String[] args) {
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);

    System.out.print("How many employees will be registred? ");
    int qtdEmployes = sc.nextInt();

    List<ListEmployee> employees = new ArrayList<>(qtdEmployes);

    for(int i = 0; i < qtdEmployes; i++){
      System.out.println("\nEmployee #" + (i + 1) + ": ");
      System.out.print("ID: ");
      int id = sc.nextInt();

      while (hasID(employees, id)){
        System.out.println("\nID already taken! Try again");
        id = sc.nextInt();
      }

      sc.nextLine(); // Necessário usar para consumir o buffer de entrada
      System.out.print("Name: ");
      String name = sc.nextLine();

      System.out.print("Salary: ");
      double salary = sc.nextDouble();

      ListEmployee employee = new ListEmployee(id, name, salary);
      employees.add(employee);
    }

    System.out.print("\nEnter the employee ID that will salary increase: ");
    int employeeID = sc.nextInt();

    /* Integer pos = position(employees, employeeID);

    if(pos == null){
      System.out.println("This ID does not exists");
    } else {
      System.out.print("Enter the percente: ");
      double newPercent = sc.nextDouble();
      employees.get(pos).increaseSalary(newPercent);
    }

    System.out.println("\nEmployee's List : ");
    for(ListEmployee emp: employees){
      System.out.println(emp); //Implicitamente já usa método toString()
    }

     */

    ListEmployee emp = employees.stream().filter(e -> e.getId() == employeeID).findFirst().orElse(null);

    if(emp == null){
      System.out.println("This ID does not exists!");
    } else {
      System.out.print("Enter the percente: ");
      double newPercent = sc.nextDouble();
      emp.increaseSalary(newPercent);
    }

    System.out.println("\nEmployee's List: ");
    for(ListEmployee employee: employees){
      System.out.println(employee); //Implicitamente já usa método toString()
    }

    sc.close();
  }

  public static Integer position(List<ListEmployee> employees, int id){
    for(int i = 0; i < employees.size(); i ++){
      if(employees.get(i).getId() == id){
        return i;
      }
    }
    return null;
  }

  public static boolean hasID(List<ListEmployee> employees, int ID){
    ListEmployee employee = employees.stream().filter(e -> e.getId() == ID).findFirst().orElse(null);
    return employee != null;
  }
}
