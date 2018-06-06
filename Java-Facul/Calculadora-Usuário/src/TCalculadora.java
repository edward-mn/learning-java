import java.util.Scanner;


public class TCalculadora {

	public static void main(String[] args) {
		Scanner Leitor = new Scanner (System.in);
		int Tabuada,Opcao;
		float num1,num2;
		
		System.out.println("Escolha uma tabuada de 0 a 10: ");
		Opcao = Leitor.nextInt();
		
		
		switch (Opcao) {
		case 1:
			System.out.println(
					"1*1=1" + "\n" +
					"1*2=2"	+ "\n" +
					"1*3=3" + "\n" +
					"1*4=4" + "\n" +
					"1*5=5" + "\n" +
					"1*6=6" + "\n" +
					"1*7=7" + "\n" +
					"1*8=8" + "\n" +
					"1*9=9" + "\n" +
					"1*10=10" + "\n" 
					);
			break;

		default:
			System.out.println("Digite uma Opção válida !");
		}
	}
}