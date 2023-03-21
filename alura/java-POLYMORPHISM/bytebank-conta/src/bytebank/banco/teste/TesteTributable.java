package bytebank.banco.teste;

import bytebank.banco.modelo.ContaCorrente;
import bytebank.banco.modelo.LifeInsurance;
import bytebank.banco.modelo.TributeCauculator;

public class TesteTributable {
  public static void main(String[] args) {
    ContaCorrente cc = new ContaCorrente(123, 258);
    cc.deposita(100.0);

    LifeInsurance li = new LifeInsurance();
    TributeCauculator tc = new TributeCauculator();
    tc.registra(cc);
    tc.registra(li);

    System.out.println(tc.getTotalTribute());
  }

}
