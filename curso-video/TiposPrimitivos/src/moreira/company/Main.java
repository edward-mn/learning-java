package moreira.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Saída de dados
	    float nota = 8.5f;
	    String nome = "Edward";
	    System.out.println("LN - A nota é: " + nota);
	    System.out.printf("Printf - A nota de %s é %.2f \n", nome, nota); //2 casas
        System.out.format("Format - A nota foi %.2f \n", nota);

        /** Entrada de dados
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite o nome: ");
        String inputName = teclado.nextLine();
        System.out.print("Digite a nota: ");
        float inputNota = teclado.nextFloat();
        System.out.printf("Input - A nota de %s é %.2f \n", inputName, inputNota);
         **/

        // Convert types
        String valorString = "30";
        Integer valorInteger = 40;
        String text = "String - " + Integer.toString(valorInteger) + " Integer - " + Integer.parseInt(valorString);
        System.out.println(text);
    }
}
