package moreira.company;

public class Peixe extends Animal{
  protected String corEscama;

  public String getCorEscama() {
    return corEscama;
  }

  public void setCorEscama(String corEscama) {
    this.corEscama = corEscama;
  }

  @Override
  protected void locomover() {
    System.out.println("Nadando");
  }

  @Override
  protected void alimentar() {
    System.out.println("Comendo substâncias");
  }

  @Override
  protected void emitirSom() {
    System.out.println("Glup");
  }

  public void soltarBolha(){
    System.out.println("Soltou bolha");
  }
}
