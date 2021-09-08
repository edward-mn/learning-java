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

  public void reagir(String frase){
    if(frase.equals("Toma comida") ||frase.equals("Olá")){
      System.out.println("Abanar o rabo e Latir");
    } else {
      System.out.println("Rosnar");
    }
  }

  public void reagir(int hora, int min){
    if(hora < 12){
      System.out.println("Abanar");
    } else if (hora >= 18){
      System.out.println("Ignorar");
    } else {
      System.out.println("Abanar e latir");
    }
  }

  public void reagir(boolean dono){
    if(dono){
      System.out.println("Abanar Feliz");
    } else {
      System.out.println("Rosnar e Latir");
    }
  }

  public void reagir(int idade, float peso){
    if(idade < 5){
      if (peso < 10){
        System.out.println("Abanar");
      } else {
        System.out.println("Latir");
      }
    } else {
      if( peso < 10){
        System.out.println("Rosnar");
      } else {
        System.out.println("Ignorar");
      }
    }
  }
}
