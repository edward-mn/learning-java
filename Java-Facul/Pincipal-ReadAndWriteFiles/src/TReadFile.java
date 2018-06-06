import java.io.FileWriter;
import java.io.PrintWriter;


public class TReadFile {
			String Local;
			
			public void setLocal(String Path) {
				this.Local = Path;
			}
			
			public String getLocal() {
				return this.Local;
			}
			
			FileWriter Leitor;
			
			public void setLeitor() {
				try{
					this.Leitor = new FileWriter(this.getLocal());
				}catch(Exception ex){
					System.out.println("Erro ao tentar abrir o arquivo");
				}
			}
			
			public FileWriter getLeitor() {
				return this.Leitor;
			}	
		}
