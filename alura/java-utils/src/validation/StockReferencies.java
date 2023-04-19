package validation;

public class StockReferencies {
  private Test referencies[];
  private int positionFree;

  public StockReferencies() {
    this.referencies = new Test[10];
    positionFree = 0;
  }

  public void stocking(Test t) {
    this.referencies[this.positionFree] = t;
    this.positionFree++;
  }

  public int amountStocks() {
    return this.positionFree;
  }

  public Test getReferency(int position) {
    return this.referencies[position];
  }
}
