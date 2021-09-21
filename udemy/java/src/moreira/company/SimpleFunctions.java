package moreira.company;

import java.util.Scanner;

public class SimpleFunctions {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter three numbers: ");
    int n1 = sc.nextInt();
    int n2 = sc.nextInt();
    int n3 = sc.nextInt();

    showResult(max(n1, n2, n3));
  }

  public static int max(int x, int y, int z){
    int result;

    if(x > y && x > z){
      result = x;
    } else result = (y > z) ? y : z; // Math.max(y, z);

    return result;
  }

  public static void showResult(int value){
    System.out.println("Higher = " + value);
  }
}
