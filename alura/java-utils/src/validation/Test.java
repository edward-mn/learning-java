package validation;

public class Test extends Object {

  // Array []
  public static void main(String[] args) {

    int[] idades = new int[5]; // inicializa o array com os valores padroes

    for (int i = 0; i < idades.length; i++) {
      idades[i] = i * i;
    }

    for (int i = 0; i < idades.length; i++) {
      System.out.println(idades[i]);
    }

  }

  // @Override
  // public boolean equals(Object ref) {

  // Test outro = (Test) ref;

  // if (this.agencia != outro.agencia) {
  // return false;
  // }

  // if (this.numero != outro.numero) {
  // return false;
  // }

  // return true;
  // }
}