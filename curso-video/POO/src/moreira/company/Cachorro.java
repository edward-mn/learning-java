package moreira.company;

public class Cachorro extends Mamifero{
  public void enterrarOsso(){
    System.out.println("Enterrando Osso");
  }

  public void abarRabo(){
    System.out.println("Feliz, abanando o rabo para dono");
  }

  @Override
  protected void emitirSom() {
    System.out.println("Roof Roof, Au au");
  }
}
