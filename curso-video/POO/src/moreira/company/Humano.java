package moreira.company;

public class Humano {
  private String nome, Sexo;
  private Integer idade;

  public void fazerNiver(){
    this.idade++;
  }

  public void infos(){
    System.out.println("Humano{" +
        "nome='" + nome + '\'' +
        ", Sexo='" + Sexo + '\'' +
        ", idade=" + idade +
        '}');
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public String getSexo() {
    return Sexo;
  }

  public void setSexo(String sexo) {
    Sexo = sexo;
  }

  public Integer getIdade() {
    return idade;
  }

  public void setIdade(Integer idade) {
    this.idade = idade;
  }
}
