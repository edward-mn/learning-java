
public abstract class TPessoa {
	protected String Nome, Mostra;
	protected float Peso, Altura;

	abstract protected void setNome(String Name);
	abstract protected void setPeso(Float P);
	abstract protected void setAltura(Float A);
	abstract protected void Mostratudo();
	
	abstract protected String getNome();
	abstract protected Float getPeso();
	abstract protected Float getAltura();
}
