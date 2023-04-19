package util;

import java.util.ArrayList;
import java.util.List;

public class WrapperInteger {
  public static void main(String[] args) {
    int idades[] = new int[4];
    String nomes[] = new String[4];

    int idade = 25; // Integer -> Automatically it's transformed into Object type Integer
    List numeros = new ArrayList(); // List<Integer> numeros = new ArrayList<Integer>();
    numeros.add(idade); // Would not accept -> Java make a magic (Object - Primitive) -> Autoboxking

    int refInt = Integer.valueOf(29);

    String s = "12";
    Integer numero = Integer.valueOf(s);
    System.out.println("valueOF = " + numero);

    int num = Integer.parseInt(s);
    System.out.println("parseInt = " + numero);

    System.out.println(Integer.MAX_VALUE);
    System.out.println(Integer.MIN_VALUE);
    System.out.println(Integer.SIZE);
    System.out.println(Integer.BYTES);

    Integer ref = Integer.valueOf("3");
    ref++;
    System.out.println(ref);
  }
}
