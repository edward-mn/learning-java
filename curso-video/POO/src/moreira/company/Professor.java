package moreira.company;

public class Professor extends Humano{
  private String especialidade;
  private float salario;

  public String getEspecialidade() {
    return especialidade;
  }

  public void setEspecialidade(String especialidade) {
    this.especialidade = especialidade;
  }

  public float getSalario() {
    return salario;
  }

  public void setSalario(float salario) {
    this.salario = salario;
  }

  public void receberAumento(float aum){
    this.salario += aum;
    System.out.println("Salário foi aumentado para " + this.salario);
  }
}
