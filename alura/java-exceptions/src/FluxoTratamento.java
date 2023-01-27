public class FluxoTratamento {

  public static void main(String[] args) {
    System.out.println("Ini do main");
    try {
      metodo1();
    } catch (Exception e) {
      System.out.println(e.getMessage());
    }

    System.out.println("Fim do main");
  }

  private static void metodo1() {
    System.out.println("Ini do metodo1");
    metodo2();
    System.out.println("Fim do metodo1");
  }

  private static void metodo2() {
    System.out.println("Ini do metodo2");
    // Unchecked way
    throw new MyException("--- Deu ruim viu"); // Create and Thoewing the exception

    // System.out.println("Fim do metodo2");
  }
}