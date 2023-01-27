public class FluxoTratamentoErro {

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
    metodo2(); // Stack overflow - most famous error
    System.out.println("Fim do metodo2");
  }
}