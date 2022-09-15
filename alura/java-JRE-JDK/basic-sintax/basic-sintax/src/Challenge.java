public class Challenge {
  public static void main(String[] args) {
    System.out.println("multiple of three | 0 - 100");

    System.out.println("Normal form");
    for (int i = 0; i < 100; i++) {
      if (i % 3 == 0) {
        System.out.println(i);
      }
    }

    System.out.println("\nBetter form");
    for (int i = 0; i < 100; i += 3) {
      System.out.println(i);
    }

    System.out.println("Simple Factorial Math");
    int value = 6;
    int fatorial = 1;

    for (int i = 0; i <= value; i++) {
      if (i != 0)
        fatorial *= i;
      else
        fatorial = 1;

    }

    System.out.println("O fatorial é " + fatorial);
  }
}
