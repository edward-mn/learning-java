public class TesteReferencia {
  public static void main(String[] args) {
    System.out.println("Referenciando contas");
    Conta primeiraConta = new Conta();
    primeiraConta.saldo = 400;

    System.out.println("Primeira Conta \n" + primeiraConta.saldo);

    Conta segundaConta = primeiraConta;
    System.out.println("Segunda Conta \n" + segundaConta.saldo);

    segundaConta.saldo += 100;

    System.out.println("Segunda Conta \n" + primeiraConta.saldo);
    System.out.println("Primeira Conta \n" + primeiraConta.saldo);

    if (primeiraConta == segundaConta) {
      System.out.println("são a mesmíssima conta");
    }

    primeiraConta.titular = "Edward";
    System.out.println("Primeira Conta \n" + primeiraConta.titular);

    segundaConta.titular = "Vagner";
    System.out.println("Segunda Conta \n" + segundaConta.titular);
  }
}
