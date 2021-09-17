package moreira.company;

import java.util.Scanner;

public class Mod4_Two {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Quantidade de números");
    int n = sc.nextInt();

    int in = 0;
    int out = 0;

    System.out.println("Números");
    for(int i = 0; i < n; i++){
      int x = sc.nextInt();
      if(x >= 10 && x <= 20){
        in++;
      } else {
        out++;
      }
    }

    System.out.println("In:" + in);
    System.out.println("Out:" + out);

    sc.close();
  }
}
