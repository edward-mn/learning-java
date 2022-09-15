public class PrimitiveVar {
    public static void main(String[] args) {
        System.out.println("Hello, World!");

        int idade = 25;
        System.out.println("Idade é: " + idade);

        double peso = 78.200;
        System.out.println("Peso é: " + peso + "Kg");

        int intDiv = 5 / 2;
        System.out.println("Int : " + intDiv);

        double doubDiv = 5 / 2;
        System.out.println("Double Div: " + doubDiv);

        double doubDivNominador = 5.0 / 2;
        System.out.println("Double Div (Nominador) : " + doubDivNominador);

        double salario = 1270.50;
        int valor = (int) salario;
        System.out.println(valor); // Only integer numbers

        double valor1 = 0.2;
        double valor2 = 0.1;
        double total = valor1 + valor2;

        System.out.println(total);
        char letra = 'a';
        System.out.println(letra);

        char numberChar = 66;
        System.out.println(numberChar);

        char numberCharTypeCast = (char) (numberChar + 1);
        System.out.println(numberCharTypeCast);

        String palavra = "alura cursos online de tecnologia" + 2020;
        System.out.println(palavra);
    }
}
