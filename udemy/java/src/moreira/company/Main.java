package moreira.company;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String product1 = "Computer";
        String product2 = "Office desk";

        int age = 30;
        int code = 5290;

        char gender = 'F';

        double price1 = 2100.0;
        double price2 = 650.50;
        double measure = 53.234567;

        System.out.printf("" +
            "Products:\n" +
            "%s which price is $ %.2f \n" +
            "%s which price is $ %.2f \n\n" +
            "Record: %d years old, code %d and gender: %s\n\n" +
            "Measue with eight decimal places: %.8f\n" +
            "Rouded (three decimal places): %.3f\n"
            , product1, price1, product2, price2, age, code, gender, measure, measure
        );

        Locale.setDefault(Locale.US);
        System.out.printf("US decimal point: %.3f\n", measure);

        System.out.println("Digitando vários valores, usar espaço! S - I - D");
        Scanner sc = new Scanner(System.in);
        String x;
        int y;
        double z;
        x = sc.next();
        y = sc.nextInt();
        z = sc.nextDouble();
        System.out.printf("Dados digitados\n%s\n%d\n%f", x, y, z);

        System.out.println("Lendo uma frase toda e outro tipo de dado");
        String s1, s2, s3;
        int n;
        n = sc.nextInt();
        sc.nextLine(); // Necessário, pois o nextLine vai consumir a linha vazia
        s1 = sc.nextLine();
        s2 = sc.nextLine();
        s3 = sc.nextLine();
        System.out.printf("Dados digitados\n%d\n%s\n%s\n%s", x, y, z);
    }
}
