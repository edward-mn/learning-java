import java.io.PrintWriter;
import java.util.Scanner;


public class TWriteInformation extends TReadInformation{
		PrintWriter grava;
	
		public void setGrava(String Dados) {
			this.setLocal("C:/exemplo/Nota0.2.txt");
			this.setLeitor();
			
			grava = new PrintWriter(this.getLeitor());
			
			this.PedeDados();
			this.MostraDados();
			
			grava.printf(Dados);
			
			grava.close();
		}
			
}
