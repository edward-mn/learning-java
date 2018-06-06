import java.util.Scanner;


public class TBicho {
	
	String Nome,Sexo,Raca,Dono;
	int Idade;
	
	public void setNome(String Name) {
		this.Nome = Name;
	}
	
	public String getNome() {
		return this.Nome;
	}
	
	public void setSexo(String Sex) {
		this.Sexo = Sex;
	}
	
	public String getSexo() {
		return this.Sexo;
	}
	
	public void setRaca(String Tipo) {
		this.Raca = Tipo;
	}
	
	public String getRaca() {
		return this.Raca;
	}
	
	public void setDono(String NomeDono) {
		this.Dono = NomeDono;
	}
	
	public String getDono() {
		return this.Dono;
	}
	
	public void setIdade(int Age) {
		this.Idade= Age;
	}
	
	public int getIdade() {
		return this.Idade;
	}	
	
	public static void main(String[] args) {
		TBicho MyBicho = new TBicho();
		Scanner Leitor = new Scanner (System.in);
		
		System.out.println("Digite o nome do Bicho: ");		
		MyBicho.setNome(Leitor.next());
		
		System.out.println("Digite o nome do dono do Bicho: ");		
		MyBicho.setDono(Leitor.next());
		
		System.out.println("Digite Sexo do Bicho: ");		
		MyBicho.setSexo(Leitor.next());
	
		System.out.println("Digite Raca do Bicho: ");		
		MyBicho.setRaca(Leitor.next());
		
		System.out.println("Digite a idade do Bicho: ");		
		MyBicho.setIdade(Leitor.nextInt());
		
		System.out.println(MyBicho.getNome());
	}
}
