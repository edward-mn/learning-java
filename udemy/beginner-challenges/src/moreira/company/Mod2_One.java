package moreira.company;

import java.util.Scanner;

public class Mod2_One {
  public static void main(String[] args) {
    int n1;

    Scanner sc = new Scanner(System.in);
    n1 = sc.nextInt();
    if(n1 < 0){
      System.out.println("Negativo");
    } else {
      System.out.println("Positivo");
    }

    sc.close();
  }
}
