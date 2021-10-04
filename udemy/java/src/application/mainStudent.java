package application;

import entities.Student;

import java.util.Locale;
import java.util.Scanner;

public class mainStudent {
  public static void main(String[] args) {
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);
    Student edStudent = new Student();

    edStudent.name = sc.nextLine();
    edStudent.n1 = sc.nextDouble();
    edStudent.n2 = sc.nextDouble();
    edStudent.n3 = sc.nextDouble();
    System.out.print(edStudent.resultInfo());
  }
}
