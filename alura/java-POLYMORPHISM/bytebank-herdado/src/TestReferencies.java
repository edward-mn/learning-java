public class TestReferencies {
  public static void main(String[] args) {
    Manager manager = new Manager(); // Right: especific | Left: Generic

    manager.setName("Some test");
    manager.setSalary(3500.00);

    // Employee employee = new Employee();
    // employee.setSalary(1000.00);

    VideoEditor ev = new VideoEditor();
    ev.setSalary(1500.00);

    BonificationControll controll = new BonificationControll();
    controll.register(manager);
    // controll.register(employee);
    controll.register(ev);

    System.out.println(controll.getValues());

    // manager.autentication() -> Employee has only in the employee
  }
}
