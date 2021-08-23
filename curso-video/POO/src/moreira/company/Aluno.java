package moreira.company;

public class Aluno extends Humano{
  private Integer matricula;
  private String Curso;

  public Integer getMatricula() {
    return matricula;
  }

  public void setMatricula(Integer matricula) {
    this.matricula = matricula;
  }

  public String getCurso() {
    return Curso;
  }

  public void setCurso(String curso) {
    Curso = curso;
  }

  public void cancelarMatricula(){
    System.out.println("Matricula será cancelada");
  }
}
