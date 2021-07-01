package moreira.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        /*
        Caneta c1 = new Caneta();
        c1.modelo = "Governo";
        c1.cor = "Azul";
        c1.carga = 90;
        c1.setPonta(0.5f);
        c1.tampar();
        c1.status();
        c1.rabiscar();

        System.out.println("---");

        Caneta c2 = new Caneta();
        c2.modelo = "Bic";
        c2.cor = "Preta";
        c2.carga = 70;
        c2.setPonta(0.2f);
        c2.destampar();
        c2.status();
        c2.rabiscar();

        System.out.println("---");

        Caneta_GSC c3 = new Caneta_GSC("Governim", "Orange", 0.5f);
        c3.setModelo("BIC");
        c3.setPonta(0.8f);
        c3.status();

        System.out.println("---");

        ContaBancaria edwardAccount = new ContaBancaria();
        edwardAccount.abrirConta();
        edwardAccount.fecharConta();
        edwardAccount.zerarConta();
        edwardAccount.depositar(50f);
        edwardAccount.pagarMensalidade();
        edwardAccount.fecharConta();

         Regra 3
        System.out.println("Regra de 3");
        Scanner insert = new Scanner(System.in);
        int firstReference = insert.nextInt();
        int secondReference = insert.nextInt();;
        int thirdReference = insert.nextInt();
        int option = 0;
        double result = 0f;

        do {
            System.out.printf("Digite a opçao desejada \n [ 1 ] - Descobrir %d\n [ 2 ] - Descobrir  %d\n", firstReference, secondReference);
            option = insert.nextInt();
            if(option == 1){
                result = (thirdReference * secondReference) / firstReference;
            } else if(option == 2) {
                result = (thirdReference * firstReference) / secondReference;
            } else {
                continue;
            }
            System.out.printf("Resultado: %.2f", result);
        } while (option == 1 ^ option !=2);

        ControleRemoto controleTv = new ControleRemoto();
        controleTv.ligar();
        controleTv.abrirMenu();
        controleTv.play();
        controleTv.ligarMudo();
        controleTv.desligarMudo();]

         */

        Lutador fighters[] = new Lutador[6];

        fighters[0] = new Lutador("José", "BR", 75.4f, 30, 23,5, 2);
        fighters[1] = new Lutador("Roger", "EUA", 86.2f, 37, 18,6, 1);
        fighters[2] = new Lutador("Mack", "UK", 71.4f, 28, 40,1, 0);
        fighters[3] = new Lutador("Uchen", "China", 92.3f, 35, 33,8, 4);
        fighters[4] = new Lutador("Blockover", "Russia", 105.1f, 29, 27,10, 5);
        fighters[5] = new Lutador("Ukurata", "Japão", 120.2f, 39, 5,22, 8);

        for(Lutador fighter: fighters){
            fighter.apresentar();
            fighter.status();
        }
    }
}