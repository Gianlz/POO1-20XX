package Escola;

public class Professor extends Pessoa {
	private String diciplina;

	public Professor(int codigo, String nome, String endereco, String diciplina) {
		super(codigo, nome, endereco);
		setDiciplina(diciplina);
	}

	public String getDiciplina() {
		return diciplina;
	}

	public void setDiciplina(String diciplina) {
		this.diciplina = diciplina;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(super.toString());
		builder.append("Diciplina=");
		builder.append(diciplina);
		builder.append("");
		return builder.toString();
	}

}
