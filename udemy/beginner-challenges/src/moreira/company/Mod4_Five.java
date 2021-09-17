package moreira.company;

import java.util.Scanner;

public class Mod4_Five {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Fatorial");
    int n = sc.nextInt();
    int fat = 0;

    for(int i = 1; i < n; i++){
        fat += n * (n - i);
    }
    System.out.println(fat);
    sc.close();
  }
}
