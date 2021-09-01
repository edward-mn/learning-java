package moreira.company;

public class Bolsista extends Aluno_class11{
  private float bolsa;

  public void renovarBolsa(){
    System.out.println("Renovando bolsa " + this.nome);
  }

  public void pagarMensalidade(){
    System.out.println(this.nome + " é bolsista, pagamento facilitado");
  }

  public float getBolsa() {
    return bolsa;
  }

  public void setBolsa(float bolsa) {
    this.bolsa = bolsa;
  }
}
