
public class TCliente extends TPessoa {

	@Override
	protected void setNome(String Name) {
		this.Nome = Name;
	}

	@Override
	protected void setPeso(Float P) {
		this.Peso = P;
	}

	@Override
	protected void setAltura(Float A) {
		this.Altura = A;
	}

	@Override
	protected void Mostratudo() {
		System.out.println(getNome() + "\n" + getAltura() + "\n" + getPeso());
	}

	@Override
	protected String getNome() {
		return this.Nome;
	}

	@Override
	protected Float getPeso() {
		return this.Peso;
	}

	@Override
	protected Float getAltura() {
		return this.Altura;
	}

	public static void main(String[] args) {
		TCliente Pessoa = new TCliente();
		Pessoa.setAltura(1.85f);
		Pessoa.setNome("Edward");
		Pessoa.setPeso(69.850f);
		Pessoa.Mostratudo();
	}
}
