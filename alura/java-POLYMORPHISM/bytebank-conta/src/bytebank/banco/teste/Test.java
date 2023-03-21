package bytebank.banco.teste;

import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;

public class Test {
  public static void main(String[] args) {
    System.out.println("xz");

    Object cc = new ContaCorrente(22, 33);
    Object cp = new ContaPoupanca(33, 22);

    System.out.println(cc);
    System.out.println(cp);
  }

  static void println() {
  }
}
