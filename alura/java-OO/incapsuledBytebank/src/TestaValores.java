public class TestaValores {

  public static void main(String[] args) {
    Conta conta = new Conta(2231, 53210);
    // conta.setAgencia(-50);
    // conta.setNumero(-330);

    Conta conta2 = new Conta(3125, 11002255);

    System.out.println("Total contas: " + Conta.getTotal());
  }
}
