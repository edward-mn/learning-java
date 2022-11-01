public class TestManager {
  public static void main(String[] args) {
    Manager manager = new Manager();

    manager.setName("Joseph");
    manager.setCpf("789654231");
    manager.setSalary(3000.0);
    System.out.println(manager.getName());
    System.out.println(manager.getCpf());

    manager.setPassword(222);
    System.out.println(manager.autentication(222));
    System.out.println(manager.getBonification());
  }
}
