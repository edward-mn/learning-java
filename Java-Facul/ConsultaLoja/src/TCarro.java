import java.util.Scanner;


public class TCarro {
	String Nome, Potencia, Autonomia, Fabricante, Eixos;  
	
	public void setNome(String Name){
		this.Nome = Name;
	}
	public void setPotencia(String Po){
		this.Potencia = Po;
	}
	public void setAutonomia(String Au){
		this.Autonomia = Au;
	}
	public void setFabricante(String Fa){
		this.Fabricante = Fa;
	}
	public void setEixos(String ex){
		this.Eixos = ex;
	}
	public String GetNome(){
		return this.Nome;
	}
	public String GetPotencia(){
		return this.Potencia;
	}
	public String GetAutonomia(){
		return this.Autonomia;
	}
	public String GetFabricante(){
		return this.Fabricante;
	}
	public String GetEixos(){
		return this.Eixos;
	}
	
	public void PedeDados() {
		Scanner Leitor = new Scanner(System.in);
		
		System.out.println("Digite o nome; ");
		this.setNome(Leitor.nextLine());
		
		System.out.println("Digite a Potencia; ");
		this.setPotencia(Leitor.nextLine());
		
		System.out.println("Digite o Autonomia; ");
		this.setAutonomia(Leitor.nextLine());
		
		System.out.println("Digite o Fabricante; ");
		this.setFabricante(Leitor.nextLine());
		
		System.out.println("Digite a quantidade de Eixos; ");
		this.setEixos(Leitor.nextLine());
	}
	
	public void MostraDados() {
		System.out.print(this.GetNome() + '\n');
		System.out.print(this.GetPotencia() + '\n');
		System.out.print(this.GetAutonomia() + '\n');
		System.out.print(this.GetFabricante() + '\n');
		System.out.print(this.GetEixos() + '\n');
	}
}
