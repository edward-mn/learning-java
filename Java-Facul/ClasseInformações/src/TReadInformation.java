import java.io.FileWriter;
import java.util.Scanner;


public class TReadInformation {
	String Local,Nome,Endereco;
	int Telefone;
	
	public void setNome(String Name) {
		this.Nome = Name;
	}
	
	public String getNome() {
		return this.Nome;
	}
	
	public void setEndereco(String adress) {
		this.Endereco = adress;
	}
	
	public String getEndereco() {
		return this.Endereco;
	}
	
	public void setTelefone(int Tel) {
		this.Telefone = Tel;
	}
	
	public int getTelefone() {
		return this.Telefone;
	}
	
	public void PedeDados() {
		Scanner Leitor = new Scanner(System.in);
		
		System.out.println("Digite o nome; ");
		this.setNome(Leitor.nextLine());
		
		System.out.println("Digite o seu endereço; ");
		this.setEndereco(Leitor.nextLine());
		
		System.out.println("Digite a quantidade de Eixos; ");
		this.setTelefone(Leitor.nextInt());
	}
	
	public void MostraDados() {
		System.out.print(this.getNome() + '\n');
		System.out.print(this.getEndereco() + '\n');
		System.out.print(this.getTelefone() + '\n');
	}
	
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
