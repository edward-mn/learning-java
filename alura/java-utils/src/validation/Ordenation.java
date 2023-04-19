package validation;

import java.util.ArrayList;
import java.util.List;

public class Ordenation {
  public static void main(String[] args) {
    Test test1 = new Test();
    Test test2 = new Test();

    List<Test> lista = new ArrayList<>();
    lista.add(test1);
    lista.add(test2);

    foreach (Test t : lista) {
      System.out.println(t);
  }

  TestComparator comparator = new TestComparator();

  System.out.println("---------");

  lista.sort(comparator);

  foreach (Test t : lista) {
    System.out.println(t);
}
  }
}

class TitularDaContaComparator implements Comparator<Conta> {

  @Override
  public int compare(Conta c1, Conta c2) {

    String nomeC1 = c1.getTitular().getNome();
    String nomeC2 = c2.getTitular().getNome();
    return nomeC1.compareTo(nomeC2);
  }
}

class TestComparator implements Comparator<Test> {

  @Override
  public int compare(Test t1, Test t2) {

    if (t1 < t2) {
      return -1;
    }

    if (t1 > t2) {
      return 1;
    }

    return 0;
  }
}

// Código omitido

public class Teste {

  //Código omitido
  
          for (Conta conta : lista) {
                  System.out.println(conta);
          }
  
  //        NumeroDaContaComparator comparator = new NumeroDaContaComparator();
          lista.sort(null);
  
  //                Collections.sort(lista, new NumeroDaContaComparator());
  //                Collections.sort(list);
  //                Collections.reverse(lista);
  
          System.out.println("---------");
  
          for (Conta conta : lista) {
                  System.out.println(conta + ", " + conta.getTitular().getNome());
          }
  
  }

class TitularDaContaComparator implements Comparator<Conta> {

  @Override
  public int compare(Conta c1, Conta c2) {

    String nomeC1 = c1.getTitular().getNome();
    String nomeC2 = c2.getTitular().getNome();
    return nomeC1.compareTo(nomeC2);
  }
}

class NumeroDaContaComparator implements Comparator<Conta> {
  
          @Override
          public int compare(Conta c1, Conta c2) {
  
                              return Integer.compare(c1.getNumero(), c2.getNumero());
  
  //                        return c1.getNumero() - c2.getNumero();
  //
  //                if(c1.getNumero() < c2.getNumero()) {
  //                    return -1;
  //                }
  //
  //                if(c1.getNumero() > c2.getNumero()) {
  //                    return 1;
  //                }
  //
  //            return 0;
          }
  }