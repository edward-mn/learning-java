package moreira.company;

public class Ave extends Animal{
  protected String corPena;

  public String getCorPena() {
    return corPena;
  }

  public void setCorPena(String corPena) {
    this.corPena = corPena;
  }

  @Override
  protected void locomover() {
    System.out.println("Voando");
  }

  @Override
  protected void alimentar() {
    System.out.println("Comendo Frutas");
  }

  @Override
  protected void emitirSom() {
    System.out.println("Piuuuuuu");
  }

  protected void fazerNinho(){
    System.out.println("Construiu Ninho");
  }
}
