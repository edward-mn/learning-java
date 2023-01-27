public class Fluxo {

  public static void main(String[] args) {
    System.out.println("Ini do main");
    try {
      metodo1();
    } catch (ArithmeticException | NullPointerException e) {
      e.printStackTrace(); // Trace strack exception
      System.out.println("Exception -> " + e.getMessage() + "Class -> " + e.getClass().getName());
    }
    // } catch (NullPointerException en) {
    // en.printStackTrace(); // Trace strack exception
    // System.out.println("NullPointerException -> " + en.getMessage());
    // }
    System.out.println("Fim do main");
  }

  private static void metodo1() {
    System.out.println("Ini do metodo1");
    metodo2();
    System.out.println("Fim do metodo1");
  }

  private static void metodo2() {
    System.out.println("Ini do metodo2");
    for (int i = 1; i <= 5; i++) {
      System.out.println(i);
      // int a = i / 0;e
      Teste t = null;
      t.message();
    }
    System.out.println("Fim do metodo2");
  }
}