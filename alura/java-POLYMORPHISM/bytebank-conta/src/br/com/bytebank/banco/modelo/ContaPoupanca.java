package br.com.bytebank.banco.modelo;

public class ContaPoupanca extends Conta {

  public ContaPoupanca(int agencia, int numero) {
    super(agencia, numero);
  }

  @Override
  public void deposita(double valor) {
    // TODO Auto-generated method stub
    super.setSaldo(super.getSaldo() + valor);
  }

  @Override
  public String toString() {
    return "ContaPoupanca, " + super.toString();
  }
}
