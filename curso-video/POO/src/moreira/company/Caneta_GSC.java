package moreira.company;

public class Caneta_GSC {
    private String modelo;
    private float ponta;
    private boolean tampada;
    private String cor;

    public Caneta_GSC(String m, String c, float p){ //Método constructor = nome da classe
        this.modelo = m;
        this.ponta = p;
        this.tampada = true;
        this.cor = c;
        status();
    }

    public String getModelo() {
        return this.modelo;
    }

    public void setModelo(String model) {
        this.modelo = model;
    }

    public float getPonta() {
        return this.ponta;
    }

    public void setPonta(float p) {
        this.ponta = p;
    }

    public void tampar() {
        this.tampada = true;
    }

    public void destampar() {
        this.tampada = false;
    }

    public void status(){
        System.out.println("Info da caneta");
        System.out.println("Modelo: " + this.getModelo());
        System.out.println("Ponta: " + this.getPonta());
        System.out.println("Tampada? -> " + this.tampada);
        System.out.println("Cor: " + this.cor);
    }
}
