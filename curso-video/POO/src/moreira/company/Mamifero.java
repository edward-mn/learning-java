package moreira.company;

public class Mamifero extends Animal{
  protected String corPelo;

  public String getCorPelo() {
    return corPelo;
  }

  public void setCorPelo(String corPelo) {
    this.corPelo = corPelo;
  }

  @Override
  protected void locomover() {
    System.out.println("Correndo");
  }

  @Override
  protected void alimentar() {
    System.out.println("Mamando");
  }

  @Override
  protected void emitirSom() {
    System.out.println("Som de mamifero");
  }
}
