package br.com.alura.domain;

public class Pet {
    private long id;
    private String nome;
    private String tipo;
    private String raca;
    private String cor;
    private int idade;
    private float peso;

    public Pet() {}

    public Pet(String nome, String tipo, String raca, String cor, int idade, float peso) {
        this.nome = nome;
        this.tipo = tipo;
        this.raca = raca;
        this.cor = cor;
        this.idade = idade;
        this.peso = peso;
    }

    public long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getTipo() {
        return tipo;
    }

    public String getRaca() {
        return raca;
    }

    public int getIdade() {
        return idade;
    }

    public String getCor() {
        return cor;
    }

    public float getPeso() {
        return peso;
    }
}
