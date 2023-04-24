package Veiculo;

public class Caminhao extends Veiculo {
	private int eixos;

	public Caminhao(boolean motor, int eixos) {
		super(motor);
		setEixos(eixos);
	}

	public int getEixos() {
		return eixos;
	}

	public void setEixos(int eixos) {
		this.eixos = eixos;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(super.toString());
		builder.append("Eixos=");
		builder.append(eixos);
		return builder.toString();
	}

}
