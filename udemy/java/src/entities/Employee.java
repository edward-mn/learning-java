package entities;

public class Employee {
  public String name;
  public Double grossSalary, tax;

  public double netSalary(){
    return grossSalary - tax;
  }

  public void increaseSalary(double percentage){
    grossSalary += grossSalary * (percentage / 100);
  }

  public String toString() {
    return "%nEmployee: " + name + ", $ " + String.format("%.2f", netSalary()) + "%n";
  }
}
