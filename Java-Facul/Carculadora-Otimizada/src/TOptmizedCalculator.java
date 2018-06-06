import java.util.Scanner;


public class TOptmizedCalculator {

	public static void main(String[] args) {
		int Tabuada;
		System.out.println("Escolha a tabuada: ");
		Scanner Leitor = new Scanner(System.in);
		Tabuada = Leitor.nextInt();
		
		for (int Contador = 1;	Contador <= 10; Contador ++) {
			int Resultado = Contador * Tabuada;
		System.out.printf("%d * %d = %d \n", Tabuada, Contador, Resultado);
		}
	}
}
