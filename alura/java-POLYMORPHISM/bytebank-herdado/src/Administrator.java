public class Administrator extends Employee implements Authenticable {

  private Utils autenticator;

  public Administrator() {
    this.autenticator = new Utils();
  }

  @Override
  public double getBonification() {
    return 50;
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
