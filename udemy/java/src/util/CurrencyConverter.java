package util;

public class CurrencyConverter {

  public static double dollarToReais(double dollarPrice, double qtdDollar){
    final double IOF = 0.06;
    double impost = dollarPrice * qtdDollar * IOF;

    return dollarPrice * qtdDollar + impost;
  }
}
