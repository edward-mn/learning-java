package br.com.bytebank.banco.modelo;

public class TributeCauculator {

  private double totalTribute;

  public void registra(Tributable t) {
    double value = t.getTributeValue();
    this.totalTribute += value;
  }

  public double getTotalTribute() {
    return totalTribute;
  }
}
