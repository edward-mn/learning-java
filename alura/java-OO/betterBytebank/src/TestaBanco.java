public class TestaBanco {
  public static void main(String[] args) {
    Cliente edward = new Cliente();
    edward.setNome("Edward");
    edward.setCpf("12313213");
    edward.setProfissao("Dev");

    Conta contaEdward = new Conta(231, 1123);
    contaEdward.deposita(100);

    contaEdward.setTitular(edward); // Compposição
    System.out.println(contaEdward.getTitular().getNome());
  }
}
