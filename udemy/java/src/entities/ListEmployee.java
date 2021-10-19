package entities;

public class ListEmployee {
  private Integer id;
  private String name;
  private double salary;

  public ListEmployee(Integer id, String name, double salary) {
    this.id = id;
    this.name = name;
    this.salary = salary;
  }

  public String toString() {
    return id + ", " + name + ", $" + String.format("%.2f", salary);
  }

  public void increaseSalary(double percent){
    salary *= (percent / 100);
  }

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public double getSalary() {
    return salary;
  }

  public void setSalary(double salary) {
    this.salary = salary;
  }

}
