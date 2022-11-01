public class Manager extends Employee implements Authenticable {

  private Utils autenticator;

  public Manager() {
    this.autenticator = new Utils();
  }

  @Override
  public double getBonification() {
    return super.getSalary(); // super class - Employee
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