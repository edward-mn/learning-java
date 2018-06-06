import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;



public class Tprojeto {
	
	public static void main(String[] args) {
		Scanner Leitor = new Scanner(System.in);
		String nome, endereco, concatenar;
		int telefone;
		
		System.out.println("Digite seu nome: ");
		nome = Leitor.nextLine();
		
		System.out.println("Digite seu endereco: ");
		endereco = Leitor.nextLine();
		
		System.out.println("Digite seu telefone: ");
		telefone = Leitor.nextInt();
		
		
		concatenar = nome +" "+ endereco+" "+ telefone;
		
		try {
			FileWriter arquivo = new FileWriter("C:/exemplo/Nota0.2.txt");
			PrintWriter gravar = new PrintWriter(arquivo);
			gravar.printf(concatenar);
			arquivo.close();
			System.out.println("arquivo salvo !");
		} catch (Exception e) {
			System.out.println("Erro ao criar o arquivo");
		}
		
	}

}
