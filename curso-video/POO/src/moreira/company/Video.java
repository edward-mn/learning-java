package moreira.company;

public class Video implements AcoesVideo{
  private Float avaliacao;
  private int curtidas, views;
  private boolean reproduzindo;
  private String titulo;

  @Override
  public String toString() {
    return "Video{" +
        "avaliacao=" + avaliacao +
        ", curtidas=" + curtidas +
        ", views=" + views +
        ", reproduzindo=" + reproduzindo +
        ", titulo='" + titulo + '\'' +
        '}';
  }

  public Video(String titulo) {
    this.titulo = titulo;
    this.avaliacao = 0f;
    this.views = 0;
    this.curtidas = 0;
    this.reproduzindo = false;
    System.out.println(toString());
  }

  public String getTitulo() {
    return titulo;
  }

  public void setTitulo(String titulo) {
    this.titulo = titulo;
  }

  public Float getAvaliacao() {
    return avaliacao;
  }

  public void setAvaliacao(Float avaliacao) {
    float nova;
    nova = this.avaliacao + avaliacao / this.views;

    this.avaliacao = nova;
  }

  public int getCurtidas() {
    return curtidas;
  }

  public void setCurtidas(int curtidas) {
    this.curtidas = curtidas;
  }

  public int getViews() {
    return views;
  }

  public void setViews(int views) {
    this.views = views;
  }

  public boolean isReproduzindo() {
    return reproduzindo;
  }

  public void setReproduzindo(boolean reproduzindo) {
    this.reproduzindo = reproduzindo;
  }

  @Override
  public void play() {
    this.reproduzindo = true;
  }

  @Override
  public void pause() {
    this.reproduzindo = false;
  }

  @Override
  public void like() {
    this.curtidas++;
  }
}
