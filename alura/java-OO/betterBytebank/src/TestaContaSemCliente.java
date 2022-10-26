public class TestaContaSemCliente {
  public static void main(String[] args) {
    Conta contaTeste = new Conta();
    System.out.println(contaTeste.getSaldo());

    contaTeste.titular = new Cliente();
    contaTeste.titular.nome = "Vagner";
    System.out.println(contaTeste.titular.nome);
  }
}
