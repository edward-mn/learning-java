public abstract class Conta {
  private double saldo;
  private int agencia;
  private int numero;
  private Cliente titular;
  private static int total; // Only used for this class - Share instances with different class - Likes
                            // global variables

  public Conta(int agencia, int numero) {
    total++; // Conta.total++
    this.agencia = agencia;
    this.numero = numero;

    System.out
        .println("Estou criando uma conta! - " + this.agencia + "|" + this.numero + "\nTotal de contas: " + total);
  };

  public abstract void deposita(double valor);

  public boolean saca(double valor) {
    if (this.saldo >= valor) {
      this.saldo -= valor;
      return true;
    }
    return false;
  }

  public boolean transfere(double valor, Conta destino) {
    if (saca(valor)) {
      destino.deposita(valor);
      return true;
    }
    return false;
  }

  public double getSaldo() {
    return this.saldo;
  }

  public void setSaldo(double saldo) {
    this.saldo = saldo;
  }

  public int getNumero() {
    return this.numero;
  }

  public void setNumero(int novoNumero) {
    if (novoNumero <= 0) {
      System.out.println("Não pode valor negativos");
      return;
    }
    this.numero = novoNumero;
  }

  public int getAgencia() {
    return this.agencia;
  }

  public void setAgencia(int novaAgencia) {
    if (novaAgencia <= 0) {
      System.out.println("Não pode valor negativos");
      return;
    }
    this.agencia = novaAgencia;
  }

  public void setTitular(Cliente titular) {
    this.titular = titular;
  }

  public Cliente getTitular() {
    return titular;
  }

  public static int getTotal() {
    return Conta.total;
  }
}
