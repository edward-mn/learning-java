package others;

import java.util.Scanner;

public class While {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int number = sc.nextInt();;

    int total = 0;
    while (number != 0){
      total += number;
      number = sc.nextInt();
      System.out.println("Para saix digite 0");
    }

    System.out.println("O total foi = " + total);
    sc.close();
  }
}
