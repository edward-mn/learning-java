package moreira.company;

import java.util.Random;

public class Luta {
    private Lutador desafiado;
    private Lutador desafiante;
    private int rounds;
    private boolean aprovada;

    public void marcarLuta(Lutador fighterOne, Lutador fighterTwo) {
        System.out.printf("Marcando luta entre %s VS %s\n", fighterOne, fighterTwo);
        if(fighterOne.getCategoria().equals(fighterTwo.getCategoria()) && fighterOne != fighterTwo){
            this.aprovada = true;
            this.desafiado = fighterOne;
            this.desafiante = fighterTwo;
        } else {
            this.aprovada = false;
            this.desafiado = null;
            this.desafiante = null;
        }
    }

    public void lutar(){
        if(this.aprovada){
            System.out.println("### DESAFIADO ##");
            this.desafiado.apresentar();
            System.out.println("### DESAFIANTE ##");
            this.desafiante.apresentar();

            Random placar = new Random();
            int vencedor = placar.nextInt(3);
            System.out.println("====== Resultado da luta ======");
            switch (vencedor) {
                case 0 -> {
                    System.out.println("Empate!");
                    this.desafiado.empatarLuta();
                    this.desafiante.empatarLuta();
                }
                case 1 -> {
                    System.out.printf("%s Venceu a luta!\n", this.desafiado.getNome());
                    this.desafiado.ganharLuta();
                    this.desafiante.perderLuta();
                }
                case 2 -> {
                    System.out.printf("%s Venceu a luta!\n", this.desafiante.getNome());
                    this.desafiado.perderLuta();
                    this.desafiante.ganharLuta();
                }
            }
            System.out.println("===================");
        } else {
            System.out.println("A luta não foi aprovada");
        }
    }

    public Lutador getDesafiado() {
        return desafiado;
    }

    public void setDesafiado(Lutador desafiado) {
        this.desafiado = desafiado;
    }

    public Lutador getDesafiante() {
        return desafiante;
    }

    public void setDesafiante(Lutador desafiante) {
        this.desafiante = desafiante;
    }

    public int getRounds() {
        return rounds;
    }

    public void setRounds(int rounds) {
        this.rounds = rounds;
    }

    public boolean isAprovada() {
        return aprovada;
    }

    public void setAprovada(boolean aprovada) {
        this.aprovada = aprovada;
    }
}
