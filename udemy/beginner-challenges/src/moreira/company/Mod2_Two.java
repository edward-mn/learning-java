package moreira.company;

import java.util.Scanner;

public class Mod2_Two {
  public static void main(String[] args) {
    int n1;

    Scanner sc = new Scanner(System.in);
    n1 = sc.nextInt();
    if(n1 % 2 == 0){
      System.out.println("Par");
    } else {
      System.out.println("Impar");
    }

    sc.close();
  }
}
