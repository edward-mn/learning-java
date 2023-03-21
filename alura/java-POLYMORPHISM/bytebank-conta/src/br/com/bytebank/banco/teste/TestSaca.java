package br.com.bytebank.banco.teste;

import modelo.Conta;
import modelo.ContaCorrente;

public class TestSaca {
  public static void main(String[] args) {
    Conta conta = new ContaCorrente(123, 321);
    conta.deposita(200.00);
    try {
      conta.saca(210.00);
    } catch (Exception e) {
      System.out.println("Main saca Exception ! - " + e.getMessage());
    }

    System.out.println(conta.getSaldo());

  }
}
