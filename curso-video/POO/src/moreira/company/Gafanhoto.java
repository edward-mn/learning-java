package moreira.company;

public class Gafanhoto extends People {
  private String login;
  private int totAssistido;

  public Gafanhoto(String nome, String sexo, int idade, String login) {
    super(nome, sexo, idade);
    this.login = login;
    this.totAssistido = 0;
    System.out.println(toString());
  }

  public String getLogin() {
    return login;
  }

  public void setLogin(String login) {
    this.login = login;
  }

  public int getTotAssistido() {
    return totAssistido;
  }

  public void setTotAssistido(int totAssistido) {
    this.totAssistido = totAssistido;
  }

  @Override
  protected void ganharExp() {

  }

  @Override
  public String toString() {
    // same without Super
    return "Gafanhoto{" +
        "login='" + login + '\'' +
        ", totAssistido=" + totAssistido +
        ", nome='" + super.getNome() + '\'' +
        ", sexo='" + super.getSexo() + '\'' +
        ", experiencia=" + experiencia +
        ", idade=" + idade +
        '}';
  }
}
