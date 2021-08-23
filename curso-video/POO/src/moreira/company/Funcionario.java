package moreira.company;

public class Funcionario extends Humano{
  private String setor;
  private Boolean isWorking;

  public Funcionario() {
    this.isWorking = false;
  }

  public String getSetor() {
    return setor;
  }

  public void setSetor(String setor) {
    this.setor = setor;
  }

  public Boolean getWorking() {
    return isWorking;
  }

  public void setWorking(Boolean working) {
    isWorking = working;
  }

  public void changStateWorking(){
    this.isWorking = !this.isWorking;
  }
}
