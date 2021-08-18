package moreira.company;

public class Livro implements Publicacao{
    private String titulo, autor;
    private Integer totPaginas, pagAtual;
    private Boolean aberto;
    private Pessoa leitor;

    public Livro(String titulo, String autor, Integer totPaginas, Pessoa leitor) {
        this.titulo = titulo;
        this.autor = autor;
        this.totPaginas = totPaginas;
        this.aberto = false;
        this.pagAtual = 0;
        this.leitor = leitor;
    }

    public String detalhes() {
        return "Livro{\n" +
            "titulo=" + titulo + ", autor=" + autor + '\n' +
            "totPaginas=" + totPaginas + ", pagAtual=" + pagAtual + '\n' +
            "aberto=" + aberto + '\n' +
            "leitor -> " + leitor.detalhes() + '\n' +
            "}\n";
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public Integer getTotPaginas() {
        return totPaginas;
    }

    public void setTotPaginas(Integer totPaginas) {
        this.totPaginas = totPaginas;
    }

    public Pessoa getLeitor() {
        return leitor;
    }

    public void setLeitor(Pessoa leitor) {
        this.leitor = leitor;
    }

    @Override
    public void abrir() {
        this.aberto = true;
    }

    @Override
    public void fechar() {
        this.aberto = false;
    }

    @Override
    public void folhear(int pagina) {
        if(pagina < this.totPaginas){
            this.pagAtual = pagina;
        } else {
            this.pagAtual = totPaginas;
        }
    }

    @Override
    public void avançarPag() {
        if(aberto && this.totPaginas < this.pagAtual){
            this.pagAtual++;
        } else {
            System.out.println("Impossível avançar página");
        }
    }

    @Override
    public void voltarPag() {
        if(aberto && this.pagAtual > 0){
            this.pagAtual--;
        } else {
            System.out.println("Impossível voltar página");
        }
    }
}
