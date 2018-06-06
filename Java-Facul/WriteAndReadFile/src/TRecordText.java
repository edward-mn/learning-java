import java.io.FileWriter;
import java.io.PrintWriter;


public class TRecordText {

	public static void main(String[] args) {
	try {
		
	FileWriter arq = new FileWriter("C:/exemplo/Aula03.txt");
	
	PrintWriter grava = new PrintWriter(arq);
	
	String text = "teste";
	
	grava.printf(text);
	
	arq.close();
	
	} catch (Exception ex) {
		System.out.println("Erro ao tentar abrir o arquivo");
	}	
	}
}
