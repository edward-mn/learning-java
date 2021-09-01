package moreira.company;

public abstract class Pessoa_class11 {
  protected String nome, sexo;
  protected int idade;

  @Override
  public String toString() {
    return "Pessoa_class11{" +
        "nome='" + nome + '\'' +
        ", sexo='" + sexo + '\'' +
        ", idade=" + idade +
        '}';
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public String getSexo() {
    return sexo;
  }

  public void setSexo(String sexo) {
    this.sexo = sexo;
  }

  public int getIdade() {
    return idade;
  }

  public void setIdade(int idade) {
    this.idade = idade;
  }

  public void fazerNiver(){
    this.idade++;
  }
}
