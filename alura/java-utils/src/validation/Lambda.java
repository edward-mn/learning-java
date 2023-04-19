package validation;

public class Lambda {
  // Código omitido

  public static void main(String[] args) {
    lista.sort((c1, c2) -> Integer.compare(c1.getNumero(), c2.getNumero()));

    Comparator<Conta> comp = (Conta c1, Conta c2) -> {
      String nomeC1 = c1.getTitular().getNome();
      String nomeC2 = c2.getTitular().getNome();
      return nomeC1.compareTo(nomeC2);
    };

    lista.sort(comp);

    lista.forEach((conta) -> System.out.println(conta + ", " + conta.getTitular().getNome()));

    // List<String> nomes = new ArrayList<>();
    // nomes.add("Super Mario");
    // nomes.add("Yoshi");
    // nomes.add("Donkey Kong");
    // nomes.forEach((nome) -> System.out.println(nome));
  }
}
