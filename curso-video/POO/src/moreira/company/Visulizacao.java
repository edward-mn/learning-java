package moreira.company;

import java.lang.Integer;

public class Visulizacao {
  private Gafanhoto espectador;
  private Video filme;

  public Visulizacao(Gafanhoto espectador, Video filme) {
    this.espectador = espectador;
    this.filme = filme;
    this.espectador.setTotAssistido(this.espectador.getTotAssistido() +1);
    this.filme.setViews(this.filme.getViews() +1);

    System.out.println("\n" + toString());
  }

  @Override
  public String toString() {
    return "Visulizacao{" +
        "espectador=" + espectador +
        ", filme=" + filme +
        '}';
  }

  public void avaliar(){
    this.filme.setAvaliacao(5f);
  }

  public void avaliar(int nota){
    this.filme.setAvaliacao((float) nota);
  }

  public void avaliar (float porc){
    int tot = 0;
    if(porc <= 20){
      tot = 3;
    } else if (porc <= 50){
      tot = 5;
    } else if(porc <= 90){
      tot = 8;
    } else {
      tot = 10;
    }

    this.filme.setAvaliacao((float) tot);
  }

  public Gafanhoto getEspectador() {
    return espectador;
  }

  public void setEspectador(Gafanhoto espectador) {
    this.espectador = espectador;
  }

  public Video getFilme() {
    return filme;
  }

  public void setFilme(Video filme) {
    this.filme = filme;
  }
}
