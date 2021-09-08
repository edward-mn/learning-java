package moreira.company;

public class Canguru extends Mamifero{
  public void usarBolsa(){
    System.out.println("Usando bolsa para carregar filhote");
  }

  @Override
  protected void locomover() {
    System.out.println("Pular e Up");
  }
}
