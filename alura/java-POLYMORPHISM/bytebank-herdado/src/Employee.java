import javax.lang.model.element.Element;

public abstract class Employee { // Abstract class
  private String name;
  private String cpf;
  private double salary;

  public abstract double getBonification(); // Abstract method - No has implementation required

  public Employee() {
    System.out.println("An " + getClass() + " has been created!");
  }

  @Override
  public String toString() {
    return "Employee [name= " + name + ", cpf= " + cpf + ", salary= " + salary + ", Bonification= "
        + this.getBonification() + "]";
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getCpf() {
    return cpf;
  }

  public void setCpf(String cpf) {
    this.cpf = cpf;
  }

  public double getSalary() {
    return salary;
  }

  public void setSalary(double salary) {
    this.salary = salary;
  }
}
