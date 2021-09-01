package moreira.company;

public class Aluno_class11 extends Pessoa_class11{
  // Herança para diferença
  private int matricula;
  private String curso;

  public void pagarMensalidade(){
    System.out.println("Pagando mensalidade do " + this.getNome());
  }

  public int getMatricula() {
    return matricula;
  }

  public void setMatricula(int matricula) {
    this.matricula = matricula;
  }

  public String getCurso() {
    return curso;
  }

  public void setCurso(String curso) {
    this.curso = curso;
  }
}
