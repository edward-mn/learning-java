public class TestaMetodo {
  public static void main(String[] args) {
    Conta conta = new Conta();
    conta.saldo = 100;
    conta.deposita(50);
    System.out.println("Valor após depósito: " + conta.saldo);
    boolean possivelSaque = conta.saca(20);
    System.out.println("Valor após saque - " + possivelSaque + " : " + conta.saldo);

    Conta conta2 = new Conta();
    conta2.deposita(1000);
    System.out.println("Valor após depósito: " + conta2.saldo);

    if (conta2.transfere(300, conta)) {
      System.out.println("Valor após transferência da Conta2: " + conta2.saldo + " para conta 1: " + conta.saldo);
    } else {
      System.out.println("Não rolou");
    }
    ;
  }
}
