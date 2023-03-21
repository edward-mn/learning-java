package br.com.bytebank.banco.modelo;

/** Oficial Comments - Java doc
 * @someone
 * Some text
 */

public abstract class Conta {
  private double saldo;
  private int agencia;
  private int numero;
  private Cliente titular;
  private static int total; // Only used for this class - Share instances with different class - Likes
                            // global variables

  /**
   *  Constructor
   * @param agencia
   * @param numero
   */
  public Conta(int agencia, int numero) {
    total++; // Conta.total++

    if (this.agencia < 1) {
      throw new IllegalArgumentException("Agência inválida = " + this.agencia);
    }

    if (this.numero < 1) {
      throw new IllegalArgumentException("Agência inválida = " + this.numero);
    }

    this.agencia = agencia;
    this.numero = numero;

    System.out
        .println("Estou criando uma conta! - " + this.agencia + "|" + this.numero + "\nTotal de contas: " + total);
  };

  public abstract void deposita(double valor);

  /**
   * Method Saca
   * @param valor
   * @throws SaldoInsuficienteException
   */
  public void saca(double valor) throws SaldoInsuficienteException {
    if (this.saldo < valor) {
      throw new SaldoInsuficienteException("Saldo -> " + this.saldo + ", Valor do saque = " + valor);
    }

    this.saldo -= valor;
  }

  public void transfere(double valor, Conta destino) throws SaldoInsuficienteException {
    this.saca(valor);
    destino.deposita(valor);
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
