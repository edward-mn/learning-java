public class TestInternSystem {
  public static void main(String[] args) {
    Manager m = new Manager();
    m.setPassword(2222);

    InternSystem si = new InternSystem();
    System.out.println("Auth" + si.autentication(m));
  }
}
