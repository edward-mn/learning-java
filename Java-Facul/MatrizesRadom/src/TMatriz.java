import java.util.Scanner;
import java.util.Vector;

import org.xml.sax.ext.LexicalHandler;


public class TMatriz {
	//cria vetores
	String []vetor = new String[5];
	
	public void setVetor(String t, int p) {
		this.vetor[p] = t;
	}
	public String getVetor(int p){
		return this.vetor[p];
	}
	
	public void PedeDados() {
		Scanner Leitor = new Scanner(System.in);
		
		System.out.println("Digite o posição; ");
		String pos = Leitor.nextLine();
		
		System.out.println("Digite um texto: ");
		String texto = Leitor.nextLine();
		
		this.setVetor(texto, Integer.parseInt(pos));
	}
	
	public void MostraDados() {
		Scanner Leitor = new Scanner(System.in);
		
		System.out.println("Qual posição que vai? ");
		int p = Leitor.nextInt();
		
		System.out.println(this.getVetor(p));
	}
}

