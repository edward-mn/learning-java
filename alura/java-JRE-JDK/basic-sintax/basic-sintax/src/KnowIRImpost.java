public class KnowIRImpost {
  public static void main(String[] args) {
    double salary = 3300.0;
    double tributeIR;

    if (salary >= 1900.0 && salary <= 2800.0) {
      tributeIR = 0.075 * salary;
    } else if (salary >= 2800.01 && salary <= 3751.0) {
      tributeIR = 0.15 * salary;
    } else if (salary >= 3751.01 && salary <= 4664.0) {
      tributeIR = 0.22 * salary;
    } else {
      tributeIR = 0.0;
    }

    System.out.println("The tribute (IR):" + tributeIR + "\nFinal value: " + (salary - tributeIR));

    System.out.printf("The tribute (IR): %.2f \nFinal value: %.2f\n", tributeIR, (salary - tributeIR));

    System.out.println("Break");
    for (int linha = 0; linha < 5; linha++) {
      for (int coluna = 0; coluna < 5; coluna++) {
        if (coluna > linha) {
          break;
        }
        System.out.print(coluna);
      }
      System.out.println();
    }

    System.out.println("Withou break");
    for (int linha = 0; linha < 5; linha++) {
      for (int coluna = 0; coluna <= linha; coluna++) {
        System.out.print(coluna);
      }
      System.out.println();
    }
  }
}
