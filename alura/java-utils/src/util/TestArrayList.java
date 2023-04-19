package util;

import java.util.ArrayList;

import validation.Test;

public class TestArrayList extends Test {
  public static void main(String[] args) {
    // ArrayList lista = new ArrayList(); // Generic

    ArrayList<Test> lista = new ArrayList<Test>(); // Options: ArrayList<E>; Vector (Thread Safe); LinkedList

    Test tt = new Test();
    lista.add(tt);

    Test tt2 = new Test();
    lista.add(tt2);

    Test tt3 = new Test();
    lista.add(tt3);

    Test tt4 = new Test();
    lista.add(tt4);

    Test tt5 = new Test();
    lista.add(tt5);

    System.out.println(lista.size());

    Test refTest = ((Test) lista.get(0));
    System.out.println(refTest);

    System.out.println(lista.remove(1));
    System.out.println(lista.size());

    System.out.println("\nNormal For");
    for (int i = 0; i < lista.size(); i++) {
      Object oRef = lista.get(i);
      System.out.println(oRef);
    }

    System.out.println("\nActual way For");
    for (Object oRef : lista) {
      System.out.println(oRef);
    }

    boolean exist = lista.contains(tt5); // Using equals method to check existence
    System.out.println("Exist? -> " + exist);

  }

}
