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

        Lutador fighters[] = new Lutador[6];

        fighters[0] = new Lutador("José", "BR", 75.4f, 30, 23,5, 2);
        fighters[1] = new Lutador("Roger", "EUA", 86.2f, 37, 18,6, 1);
        fighters[2] = new Lutador("Mack", "UK", 71.4f, 28, 40,1, 0);
        fighters[3] = new Lutador("Uchen", "China", 92.3f, 35, 33,8, 4);
        fighters[4] = new Lutador("Blockover", "Russia", 105.1f, 29, 27,10, 5);
        fighters[5] = new Lutador("Ukurata", "Japão", 120.2f, 39, 5,22, 8);

        System.out.println("Lutadores");
        for(Lutador fighter: fighters){
            fighter.apresentar();
            fighter.status();
        }

        Luta UFC01 = new Luta();
        UFC01.marcarLuta(fighters[1], fighters[3]);
        UFC01.lutar();

        Pessoa[] p = new Pessoa[3];
        Livro[] l = new Livro[3];

        p[0] = new Pessoa("Edward", "M", 21);
        p[1] = new Pessoa("Fábio", "M", 38);
        p[2] = new Pessoa("Ruti", "F", 55);

        l[0] = new Livro("Senhor das Armas", "Fred", 355, p[0]);
        l[1] = new Livro("Mente milionária", "Roger", 220, p[1]);
        l[2] = new Livro("Quem roubou meu queijo", "Paulo", 300, p[2]);

        l[0].abrir();
        l[0].folhear(250);
        for(var i=0; i < l.length; i++){
            System.out.println(l[i].detalhes());
        }


        Humano p1 = new Humano();
        Aluno p2 = new Aluno();
        Professor p3 = new Professor();
        Funcionario p4 = new Funcionario();

        p1.setNome("Edward");
        p2.setNome("Vagner");
        p3.setNome("Roger");
        p4.setNome("Hugo");

        p1.setSexo("M");
        p2.setIdade(23);

        p2.setCurso("Informática");
        p3.setSalario(2500.75f);
        p4.setSetor("Estoque");

        p3.receberAumento(500f);
        p4.changStateWorking();
        p2.cancelarMatricula();


        p1.infos();
        p2.infos();
        p3.infos();
        p4.infos();

        Visitante v1 = new Visitante();
        v1.setNome("Jovem");
        v1.setIdade(22);
        v1.setSexo("M");
        System.out.println(v1.toString());

        Aluno_class11 a1 = new Aluno_class11();
        a1.setNome("Ed");
        a1.setMatricula(231);
        a1.setCurso("Matemática");
        a1.setIdade(18);
        System.out.println(a1.toString());
        a1.pagarMensalidade();

        Bolsista b1 = new Bolsista();
        b1.setMatricula(148);
        b1.setNome("Vagner");
        b1.setBolsa(789.52f);
        b1.setSexo("M");
        b1.pagarMensalidade();
        System.out.println(b1.toString());

        Mamifero m = new Mamifero();
        Reptil r = new Reptil();
        Ave a = new Ave();
        Peixe p = new Peixe();

        Cachorro c = new Cachorro();
        Canguru k = new Canguru();
        Tartaruga t = new Tartaruga();

        c.emitirSom();
        c.alimentar();
        c.locomover();

        c.reagir(false);
        c.reagir("Olá");
        c.reagir(15,45);
        c.reagir(7,5.80f);

         */

        Video v[] = new Video[3];
        v[0] = new Video("Aula 1 de POO");
        v[1] = new Video("Aula 11 de HP");
        v[2] = new Video("Aula 1 de Web");


        Gafanhoto g[] = new Gafanhoto[2];
        g[0] = new Gafanhoto("Edward","M", 25, "Edward.Java");
        g[1] = new Gafanhoto("Bruna","F", 17, "Bruna.Jar");


    }
}