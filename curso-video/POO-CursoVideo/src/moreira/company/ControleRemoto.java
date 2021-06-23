package moreira.company;

public class ControleRemoto implements Controlador {
    private int volume;
    private int lastVolume;
    private boolean ligado;
    private boolean tocando;

    public ControleRemoto(){
        this.volume = 50;
        this.ligado = true;
        this.tocando = false;
    }

    public boolean getTocando() {
        return tocando;
    }

    public void setTocando(boolean tocando) {
        this.tocando = tocando;
    }

    public int getLastVolume() {
        return lastVolume;
    }

    public void setLastVolume(int lastVolume) {
        this.lastVolume = lastVolume;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public boolean getLigado() {
        return ligado;
    }

    public void setLigado(boolean ligando) {
        this.ligado = ligando;
    }

    private void state(String action){
        System.out.println(action);
    }

    @Override
    public void ligar() {
        state("Ligar");
        setLigado(true);
    }

    @Override
    public void desligar() {
        state("Desligar");
        setLigado(false);
    }

    @Override
    public void abrirMenu() {
        if(this.getLigado()) {
            state("Abrir menu");
            System.out.println("Está ligado? " + this.getLigado());
            System.out.println("Está tocando? " + this.getTocando());
            System.out.print("Volume: " + this.getVolume() + " -> ");
            for (int i = 0; i <= this.getVolume(); i += 10) {
                System.out.print("|");
            }
        } else {
            System.out.println("Impossível abrir menu - Controle está desligado");
        }
    }

    @Override
    public void fecharMenu() {
        state("Fechando menu...");
    }

    @Override
    public void maisVolume() {
        state("Volume +");
        if(this.getLigado()){
            this.setVolume(this.getVolume() + 5);
            System.out.println("Volume: " + this.getVolume());
        }
    }

    @Override
    public void menosVolume() {
        state("Volume -");
        if(this.getLigado()){
            this.setVolume(this.getVolume() - 5);
            System.out.println("Volume: " + this.getVolume());
        }
    }

    @Override
    public void ligarMudo() {
        state(" Mudo ");
        setLastVolume(getVolume());
        if(this.getLigado() && this.getVolume() > 0){
            this.setVolume(0);
            System.out.println("Volume: " + this.getVolume());
        }
    }

    @Override
    public void desligarMudo() {
        state("Desligar Mudo");
        if(this.getLigado() && this.getVolume() == 0){
            this.setVolume(getLastVolume());
            System.out.println("Volume: " + this.getVolume());
        }
    }

    @Override
    public void play() {
        state("Tocando");
        if(this.getLigado() && !this.getTocando()){
            this.setTocando(true);
            System.out.println("Play: " + this.getTocando());
        } else {
            System.out.println("Impossível ligar");
        }
    }

    @Override
    public void pause() {
        state("Desligando");
        if(this.getLigado() && this.getTocando()){
            this.setTocando(false);
            System.out.println("Play: " + this.getTocando());
        } else {
            System.out.println("Impossível desligar");
        }
    }
}
