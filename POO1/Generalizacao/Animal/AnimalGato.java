package Animal;

public class AnimalGato extends AnimalMamifero {
	
	private String alimento;
	
	public AnimalGato () {
		setAlimento(alimento);
	}

	public String getAlimento() {
		return alimento;
	}

	public void setAlimento(String alimento) {
		this.alimento = alimento;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(super.toString());
		builder.append(" Gato Alimento: ");
		builder.append(alimento);
		return builder.toString();
	}
	
	

}
