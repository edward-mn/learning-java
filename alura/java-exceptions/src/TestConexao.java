public class TestConexao {
  public static void main(String[] args) {

    try (Conexao conexao = new Conexao()) {
      conexao.leDados();
    } catch (IllegalStateException e) {
      System.out.println("Illegal state exception: " + e.getMessage());
    }

    // ------------------------------------------------------------
    // Conexao con = null;
    // try {
    // con = new Conexao();
    // con.leDados();
    // } catch (IllegalStateException e) {
    // System.out.println("Illegal state exception: " + e.getMessage());
    // } finally { // Optional -> Always will execute at the end
    // System.out.println("Finallys");
    // if (con != null) {
    // con.close();
    // }
    // }
  }
}
