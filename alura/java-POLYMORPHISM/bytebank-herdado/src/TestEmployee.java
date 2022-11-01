public class TestEmployee {
  public static void main(String[] args) {
    Manager will = new Manager();
    will.setName("Williams");
    will.setCpf("123456789");
    will.setSalary(3000.50);

    System.out.println(will.toString());
    System.out.println(will.getBonification());
  }
}
