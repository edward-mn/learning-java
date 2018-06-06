
public class TGato extends TAnimal{

	@Override
	protected void setRaca(String Raca) {
		this.raca = Raca;
	}

	@Override
	protected void setCor(String Color) {
		this.cor = Color;
	}

	@Override
	protected void setPorte(String Porte) {
		this.porte = Porte;
	}

	@Override
	protected String getRaca() {
		return this.raca;
	}

	@Override
	protected String getCor() {
		return this.cor;
	}

	@Override
	protected String getPorte() {
		return this.porte;
	}
	@Override
	protected void Mostratudo() {
		System.out.println(getCor() + "\n" + getPorte() + "\n" + getRaca());
	}
	public static void main(String[] args) {
		TGato MyCat = new TGato();
		MyCat.setCor("Amarelinho");
		MyCat.setPorte("Grande");
		MyCat.setRaca("Siberiano");
		MyCat.Mostratudo();	
	}
}
