public class Utils {
  private int password;

  public boolean autentication(int password) {
    return this.password == password;
  }

  public int getPassword() {
    return this.password;
  }

  public void setPassword(int password) {
    this.password = password;
  }
}
