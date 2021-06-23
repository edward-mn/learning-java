package moreira.company;

import java.awt.desktop.SystemEventListener;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    static int soma(int a, int b){
        int s = a + b;
        return s;
    }

    public static void main(String[] args) {
        System.out.printf("A soma foi %d \n", soma(5, 2));
        System.out.println("Vindo de outra classe");
        System.out.println(operacao2.contador(1 ,5));
        /*
        int n1 = 50;
        int n2 = 11 ;
        float m = (n1 + n2) / 2;
        System.out.println("Média é: " + m);
        System.out.println("Divisão é: " +(n1 / n2));
        System.out.println("Resto da Divisão é: " + (n1 % n2));

        System.out.println("Pós incremento: " + (5 + n1++));
        System.out.println("Pre incremento: " + (5 + ++n1));

        System.out.println("Atribuição shortcut: " + ( n2 += 22));

        System.out.println("Raiz quadrada: " + Math.sqrt(16));

        System.out.println("Randon: " + (5 + Math.random() * (20 - 5)));

        int r = (n1 > n2) ? n1+1 : n2-2;
        System.out.println("Ternário: " + r);

        String nome1 = "Edward";
        String nome2 = "Edward";
        String nome3 = new String("Edward");
        String result = (nome1.equals(nome3))? "É" : "Não";
        System.out.println("Equals: "+ result);

        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite sua idade: ");
        int age = teclado.nextInt();
        String isVoto = ((age>16 && age <18) || age > 70)? "É opicional": "Obrigatório";
        System.out.printf("A idade é %d e essa pessoa possui voto %s \n", age, isVoto);

        System.out.print("Digite quantidade de pernas:");
        int pernas = teclado.nextInt();
        String text;
        switch (pernas){
            case 1:
                text = "Uma";
                break;
            case 2:
                text = "Duas";
                break;
            case 3:
            case 4:
                text = "Três";
                break;
            default:
                text = "ET";
                break;
        };
        System.out.printf("A escolha de pernas foi: %s\n", text);

        int cc = 0;
        while (cc <= 6){
            System.out.println("Cambalhota número: " + cc);
            cc++;
            if(cc == 2 || cc == 4){
                continue; // Pra cima do laço
            } else if (cc == 5){
                break; // Pra fora do laço
            }
        }

        int n, soma = 0;
        String resp;
        do {
            System.out.print("Digite um número: ");
            n = teclado.nextInt();
            soma += n;
            System.out.println("Deseja continuar? [S/N]");
            resp = teclado.next();
        } while (resp.equals("S"));
        System.out.println("A Soma final dos números informados foi: " + soma);

        for(int i = 0; i <= 100; i += 10){
            System.out.println(i);
       }*/
        int numeros[] = {2,3, 10, 4, 5, 22, 8, 9, 10};
        for(int i = 0; i < numeros.length; i++){
            System.out.println("Número foi: " + numeros[i]);
        }
        String messes[] = {"Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho", "Julho",
                "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro"};
        int dias[] = {31, 28, 31, 30, 31, 30, 31, 30, 31, 30, 31, 30};
        for(int i = 0; i < messes.length; i++){
            System.out.println(messes[i] + " tem " + dias[i] + " dias!");
        }

        Arrays.sort(dias);
        for(int valor: dias){ // Like forEach
            System.out.println("Dias:" + valor);
        }

        int pos = Arrays.binarySearch(numeros, 8); // Search item and return position
        System.out.println(pos);

        int num[] = new int[20];
        Arrays.fill(num, 0); // Preenchendo tudo com 0
        for(int v: num){
            System.out.println(v + " ");
        }


    }

}
