package moreira.company;

public class Pessoa {
    private String nome, sexo;
    private Integer idade;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public void fazerNiver(){
        this.idade++;
    }

    public Pessoa(String nome, String sexo, Integer idade) {
        this.nome = nome;
        this.sexo = sexo;
        this.idade = idade;
    }

    public String detalhes() {
        return "Pessoa{ " +
            "nome=" + nome +
            ", sexo=" + sexo +
            ", idade=" + idade +
            "}";
    }
}
