package util;

import java.util.ArrayList;
import java.util.List;

public class AnotherWrappers {
  public static void main(String[] args) {
    Integer numero = Integer.valueOf(19);
    System.out.println("I - valueOF = " + numero.intValue());

    Double dRef = Double.valueOf(3.2);
    System.out.println("D - valueOF = " + dRef.doubleValue());

    Boolean bRef = Boolean.TRUE;
    System.out.println("B - valueOF = " + bRef.booleanValue());

    Number refNumber = Float.valueOf(15.75f);

    List<Number> lista = new ArrayList<>();

    lista.add(numero);
    lista.add(dRef);
    lista.add(refNumber);

    System.out.println(lista);
  }
}
