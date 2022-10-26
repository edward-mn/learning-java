public class TestaGetESet {
  public static void main(String[] args) {
    Conta conta = new Conta(231, 15789);

    conta.setNumero(1337);
    System.out.println(conta.getNumero());

    Cliente edward = new Cliente();
    edward.setNome("Edward Moreira");
    conta.setTitular(edward);
    System.out.println(conta.getTitular().getNome());

    conta.getTitular().setProfissao("Front ed - Dev");

    System.out.println(edward);
    System.out.println(conta.getTitular());
  }
}
