package bytebank.banco.modelo;

public class ContaCorrente extends Conta implements Tributable {

  public ContaCorrente(int agencia, int numero) {
    super(agencia, numero); // Access Conta()
  }

  @Override
  public void saca(double valor) throws SaldoInsuficienteException {
    double valorSacar = valor + 0.20;
    super.saca(valorSacar);
  }

  @Override
  public void deposita(double valor) {
    // TODO Auto-generated method stub
    super.setSaldo(super.getSaldo() + valor);
  }

  @Override
  public double getTributeValue() {
    // TODO Auto-generated method stub
    return super.getSaldo() * 0.01;
  }
}
