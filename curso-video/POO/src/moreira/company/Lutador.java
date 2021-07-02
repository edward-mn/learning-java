package moreira.company;

public class Lutador {
    private String nome, nacionalidade, categoria;
    private float peso;
    private int idade, vitorias, derrotas, empates;

    public Lutador(String nome, String nacionalidade, float peso, int idade, int vitorias, int derrotas, int empates) {
        this.nome = nome;
        this.nacionalidade = nacionalidade;
        setPeso(peso);
        this.idade = idade;
        this.vitorias = vitorias;
        this.derrotas = derrotas;
        this.empates = empates;
    }

    public void apresentar(){
        System.out.println("------------");
        System.out.println("Chegou momento de apresentar o lutador " + getNome());
        System.out.println("Diretamente de/a " + getNacionalidade());
        System.out.println("Com " + getPeso() + "Kg e " + getIdade() + " anos");
        System.out.println("Seu carteu é: " + getVitorias() + " Vitorias, " + getDerrotas() + " Derrotas, " + getEmpates() + " Empates");
    }

    public void status(){
        System.out.println("Lutador: " + getNome());
        System.out.println("Modalidade de peso: " + getCategoria());
        System.out.println("Seu carteu é: " + getVitorias() + " Vitorias, " + getDerrotas() + " Derrotas, " + getEmpates() + " Empates");
    }

    public void ganharLuta(){
        setVitorias(getVitorias() + 1);
    }

    public void perderLuta(){
        setDerrotas(getDerrotas() + 1);
    }

    public void empatarLuta(){
        setEmpates(getEmpates() + 1);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public String getCategoria() {
        return categoria;
    }

    private void setCategoria(){
        if (this.peso < 52.2) {
            this.categoria = "Inválido";
        } else if (this.peso <= 70.3){
            this.categoria = "Leve";
        } else if (this.peso <= 83.9){
            this.categoria = "Médio";
        } else if (this.peso <= 120.2){
            this.categoria = "Pesado";
        } else {
            this.categoria = "Peso inválido";
        }
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
        this.setCategoria();
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getVitorias() {
        return vitorias;
    }

    public void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }

    public int getDerrotas() {
        return derrotas;
    }

    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }

    public int getEmpates() {
        return empates;
    }

    public void setEmpates(int empates) {
        this.empates = empates;
    }
}
