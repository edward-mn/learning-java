public class TestaBanco {
  public static void main(String[] args) {
    Cliente edward = new Cliente();
    edward.nome = "Edward";
    edward.cpf = "12313213";
    edward.profissao = "Dev";

    Conta contaEdward = new Conta();
    contaEdward.deposita(100);

    contaEdward.titular = edward; // Compposição
    System.out.println(contaEdward.titular.nome);
  }
}
