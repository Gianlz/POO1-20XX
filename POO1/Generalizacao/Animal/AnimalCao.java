package Animal;

public class AnimalCao extends AnimalMamifero {
	
	private String raca;
	
	public AnimalCao() {
		setRaca(raca);
	}

	public String getRaca() {
		return raca;
	}

	public void setRaca(String raca) {
		this.raca = raca;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(super.toString());
		builder.append(" Cao Raça: ");
		builder.append(raca);
		return builder.toString();
	}
	
	

}
