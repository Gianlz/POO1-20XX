package Animal;

public class AnimalLagarto extends AnimalReptil {
	
	private int comprimento;
	
	public AnimalLagarto () {
		setComprimento(comprimento);
	}

	public int getComprimento() {
		return comprimento;
	}

	public void setComprimento(int comprimento) {
		this.comprimento = comprimento;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(super.toString());
		builder.append(" Lagarto Comprimento: ");
		builder.append(comprimento);
		return builder.toString();
	}
	
	

}
