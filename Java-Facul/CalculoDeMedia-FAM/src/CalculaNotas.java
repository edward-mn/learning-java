
public class CalculaNotas {
	private float NotaP1;
	private float NotaP2;
	private float NotaT1;
	private float Media;
	private String MostrarInformacoes;
	
	public void setNotaP1(float Prova1) {
		this.NotaP1 = Prova1;
	}
	public float getNotaP1() {
		return NotaP1;
	}
	
	public void setNotaP2(float Prova2) {
		this.NotaP2 = Prova2;
	}
	public float getNotaP2() {
		return NotaP2;
	}
	
	public void setNotaT1(float Trabalho1) {
		this.NotaT1 = Trabalho1;
	}
	public float getNotaT1() {
		return NotaT1;
	}
	
	public void setMedia(float Prova1, float Prova2, float Trabalho1) {
		this.Media = (Prova1+Prova2+Trabalho1)/3;
	}
	public float getMedia() {
		return Media;
	}
	public void setMostrarInformacoes(String ShowInformation) {
		this.MostrarInformacoes = ShowInformation;
		
	}
	public String getMostrarInformacoes() {
		return MostrarInformacoes;
	}
}