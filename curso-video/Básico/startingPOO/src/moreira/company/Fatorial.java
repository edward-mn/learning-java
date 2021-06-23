package moreira.company;

public class Fatorial {
    private int num = 0;
    private int fat = 1;
    private String formula = "";

    public void setValor(int n) {
        num = n;
        int fatorial = 1;
        String texto = "";
        for(int contador = num; contador > 1; contador--){
            fatorial += contador;
            texto += contador + " x ";
        }
            fat = fatorial;
            formula = "Fatorial de " + num + "!\n" + texto + "1 = ";
    }

    public int getFatorial() {
        return fat;
    }

    public String getFormula() {
        return formula;
    }

    public String getAllText(){
        return getFormula() + getFatorial();
    }
}
