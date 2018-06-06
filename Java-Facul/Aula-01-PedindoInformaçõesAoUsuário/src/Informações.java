import java.io.InputStream;
import java.util.Scanner;

public class Informações {

	public static void main(String[] args) {
		Scanner Leitor = new Scanner (System.in);
		String Nome,Endereco,Time;
		int Telefone,CEP;
		
		System.out.println("Digite seu nome: ");
		Nome = Leitor.next();
		
		System.out.println("Digite seu Endereço: ");
		Endereco = Leitor.next();
		
		System.out.println("Digite seu Time: ");
		Time= Leitor.next();
	
		System.out.println("Digite seu Telefone: ");
		Telefone = Leitor.nextInt();
		
		System.out.println("Digite seu CEP: ");
		CEP = Leitor.nextInt();
		
		System.out.println(
				"O Nome digitado foi: " + Nome + "\n" +
				"O Endereco digitado foi: " + Endereco + "\n" +
				"O Time digitado foi: " + Time + "\n" +
				"O Telefone digitado foi: " + Telefone + "\n" +
				"O CEP digitado foi: " + CEP + "\n"
				);
	}
}
