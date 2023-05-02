public class Conditionals {
    public static void main(String[] args) {
        int anoDeLancamento = 2022;
        boolean incluidoNoPlano = false;
        double notaDoFilme = 8.1;
        String tipoPlano = "premium";

        if (anoDeLancamento >= 2022) {
            System.out.println("Galera está assistindo");
        } else {
            System.out.println("Galera já assistiu hein");
        }

        if (incluidoNoPlano || tipoPlano.equals("premium")){
            System.out.println("Pode sim!");
        } else {
            System.out.println("Pode não poh");
        }
    }
}
