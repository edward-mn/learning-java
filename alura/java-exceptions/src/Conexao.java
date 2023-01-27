public class Conexao implements AutoCloseable {

  @Override
  public void close() {
    fecha();
  }

  public Conexao() {
    System.out.println("Abrindo conexao");
    // throw new IllegalStateException();
  }

  public void leDados() {
    System.out.println("Recebendo dados");
    throw new IllegalStateException(); // Inconsistent state - unchecked
  }

  public void fecha() {
    System.out.println("Fechando conexao");
  }
}