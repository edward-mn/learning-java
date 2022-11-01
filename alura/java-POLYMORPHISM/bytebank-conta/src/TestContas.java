public class TestContas {
  public static void main(String[] args) {
    ContaCorrente cc = new ContaCorrente(111, 222);
    cc.deposita(100.0);

    ContaPoupanca cp = new ContaPoupanca(333, 444);
    cp.deposita(200.0);

    cc.transfere(20.0, cp);
    cp.transfere(10.0, cc);

    System.out.println("CC - Saldo: " + cc.getSaldo());
    System.out.println("CP - Saldo: " + cp.getSaldo());
  }

}
