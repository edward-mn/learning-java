
public class TIdade {

	int Idade;
	String noome;
	
	public void setIdade(int age) {
		this.Idade = age;
	}
	
	public int getIdade() {
		return this.Idade;
	}
	
	public static void main(String[] args) {
		TIdade MyAge = new TIdade();
		MyAge.setIdade(21);
		System.out.println(MyAge.getIdade());
	}

}
