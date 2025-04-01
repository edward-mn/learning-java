package br.com.alura.screenmatch.challenge;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class MainChallenge {
    private static final List<String> input = Arrays.asList("10", "abc", "20", "30x");

    public static void main(String[] args) {
        List<Integer> filteredIntegers = optionalInteger(input);
        System.out.println("1 - filteredIntegers -> " + filteredIntegers);

        System.out.println("2 - processaNumero -> " + processaNumero(Optional.of(5))); // Saída: Optional[25]
        System.out.println("2 - processaNumero -> " + processaNumero(Optional.of(-3))); // Saída: Optional[25]
        System.out.println("2 - processaNumero -> " + processaNumero(Optional.empty())); // Saída: Optional[25]

        System.out.println("3 - processaNumero -> " + obterPrimeiroEUltimoNome("  João Carlos Silva   ")); // Saída: "João Silva"
        System.out.println("3 - processaNumero -> " + obterPrimeiroEUltimoNome("Maria   ")); // Saída: "João Silva"

        System.out.println("4 - ehPalindromo -> " + ehPalindromo("subi no onibus em marrocos")); // Saída: true
        System.out.println("4 - ehPalindromo -> " + ehPalindromo("Java")); // Saída: false

        List<String> emails = Arrays.asList("TESTE@EXEMPLO.COM", "exemplo@Java.com ", "Usuario@teste.Com");
        System.out.println("5 - converterEmails -> " + converterEmails(emails)); // Saída: ["teste@exemplo.com", "exemplo@java.com", "usuario@teste.com"]

        System.out.println("6 - getNumeroDeDias -> " + Mes.FEVEREIRO.getNumeroDeDias()); // 28
        System.out.println("6 - getNumeroDeDias -> " + Mes.JULHO.getNumeroDeDias()); // 31

        System.out.println("7 - getNumeroDeDias -> " + Moeda.DOLAR.converterPara(100)); // 19.60 (aproximado)
        System.out.println("7 - getNumeroDeDias -> " + Moeda.EURO.converterPara(100)); // 18.18 (aproximado)

        System.out.println("8 - CodigoErro -> " + CodigoErro.NOT_FOUND.getCodigo()); // 404
        System.out.println("8 - CodigoErro -> " + CodigoErro.BAD_REQUEST.getDescricao()); // Requisição inválida
    }

    // 1
    public static List<Integer> optionalInteger(List<String> values) {
        return values.stream()
                // Tenta converter os valores para Optional<Integer>
                .map(MainChallenge::parseInt) // values.stream().map(value -> MainChallenge.parseInt(value));
                .flatMap(Optional::stream)   // Filtra apenas os valores presentes no Optional
                .collect(Collectors.toList()); // Cria uma nova lista
    }

    private static Optional<Integer> parseInt(String value) {
        try {
            return Optional.of(Integer.parseInt(value));
        } catch (NumberFormatException e) {
            return Optional.empty(); // Retorna um Optional vazio se a conversão falhar
        }
    }

    // 2
    public static Optional<Integer> processaNumero(Optional<Integer> numero) {
         return numero.filter(n -> n > 0).map(n -> n * n);
    }

    // 3
    public static String obterPrimeiroEUltimoNome(String nomeCompleto) {
        String[] nomes = nomeCompleto.trim().split("\\s+");

        if (nomes.length == 1) {
            return nomes[0]; // Apenas um nome
        }
        return nomes[0] + " " + nomes[nomes.length - 1]; // Primeiro e último
    }

    // 4
    public static boolean ehPalindromo(String palavra) {
        String semEspacos = palavra.replace(" ", "").toLowerCase();
        return new StringBuilder(semEspacos).reverse().toString().equalsIgnoreCase(semEspacos);
    }

    // 5
    public static List<String> converterEmails(List<String> emails) {
        // return emails.stream().map(email -> email.toLowerCase()).collect(Collectors.toList());
        return emails.stream().map(String::toLowerCase).collect(Collectors.toList());
    }

    public enum Mes {
        JANEIRO(31),
        FEVEREIRO(28),
        MARCO(31),
        ABRIL(30),
        MAIO(31),
        JUNHO(30),
        JULHO(31),
        AGOSTO(31),
        SETEMBRO(30),
        OUTUBRO(31),
        NOVEMBRO(30),
        DEZEMBRO(31);

        private final int dias; // Campo de instância para armazenar os dias do mês

        Mes(int dias) {
            this.dias = dias; // Atribuição correta no construtor
        }

        public int getNumeroDeDias() { // Método de instância para obter o número de dias
            return dias;
        }
    }

    public enum Moeda {
        DOLAR(6.10),
        EURO(7.70),
        REAL(2.35);

        private final double cambio;

        Moeda(double taxaCambial) {
            this.cambio = taxaCambial; // Atribuição correta no construtor
        }

        public double converterPara(double valorEmReais) {
            return valorEmReais / cambio;
        }
    }

    public enum CodigoErro {
        NOT_FOUND(404, "Resource Not Found"),
        BAD_REQUEST(400, "Bad Request"),
        INTERNAL_SERVER_ERROR(500, "Resource Not Found");

        private final int statusCode;
        private final String statusCodeDescription;

        CodigoErro(Integer statusCode, String statusCodeDescription){
            this.statusCode = statusCode;
            this.statusCodeDescription = statusCodeDescription;
        }

        public int getCodigo() {
            return this.statusCode;
        }

        public String getDescricao() {
            return this.statusCodeDescription;
        }
    }

}
