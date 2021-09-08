package moreira.company;

public abstract class People {
  protected String nome, sexo;
  protected Float experiencia;
  protected int idade;

  protected abstract void ganharExp();

  public People(String nome, String sexo, int idade) {
    this.nome = nome;
    this.sexo = sexo;
    this.idade = idade;
    this.experiencia = 0f;
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

  public Float getExperiencia() {
    return experiencia;
  }

  public void setExperiencia(Float experiencia) {
    this.experiencia = experiencia;
  }

  public int getIdade() {
    return idade;
  }

  public void setIdade(int idade) {
    this.idade = idade;
  }
}
