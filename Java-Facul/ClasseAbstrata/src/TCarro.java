
public class TCarro extends TVeiculo {

	@Override
	public void setMotor(Float Motor) {
		this.motor = Motor;
	}
	@Override
	public float getMotor() {
		return this.motor;
	}

	public static void main(String[] args) {
	TCarro Celtinha = new TCarro();
	Celtinha.setMotor(1.3f);
	System.out.println(Celtinha.getMotor());
	}
}
	