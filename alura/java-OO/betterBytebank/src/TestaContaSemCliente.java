public class TestaContaSemCliente {
  public static void main(String[] args) {
    Conta contaTeste = new Conta(654, 231);
    System.out.println(contaTeste.getSaldo());

    contaTeste.setTitular(new Cliente());
    // contaTeste.setTitular(cli.setTitular("Vagner"));
    System.out.println(contaTeste.getTitular());
  }
}
