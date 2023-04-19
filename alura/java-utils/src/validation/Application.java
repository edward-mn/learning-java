package validation;

public class Application {
  public static void main(String[] args) {
    StockReferencies stocks = new StockReferencies();

    Test tt = new Test();
    Test tt2 = new Test();

    stocks.stocking(tt);
    stocks.stocking(tt2);

    int amout = stocks.amountStocks();
    System.out.println(amout);

    Test refTest = stocks.getReferency(0);
    System.out.println(refTest);
  }
}
