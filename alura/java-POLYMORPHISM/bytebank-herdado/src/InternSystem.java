public class InternSystem {
  private int password = 2222;

  public boolean autentication(Authenticable AnEmp) {
    return AnEmp.autentication(this.password);
  }
}
