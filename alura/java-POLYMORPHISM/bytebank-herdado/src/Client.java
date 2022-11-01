public class Client implements Authenticable {

  private Utils autenticator;

  public Client() {
    this.autenticator = new Utils();
  }

  @Override
  public boolean autentication(int password) {
    return this.autenticator.autentication(password);
  }

  @Override
  public int getPassword() {
    return this.autenticator.getPassword();
  }

  @Override
  public void setPassword(int password) {
    this.autenticator.setPassword(password);
  }

}
