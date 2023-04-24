package Animal;

public class AnimalMamifero extends Animal {
	
	private int dentes;
	private String corPelo;
	
	public AnimalMamifero() {
		setDentes(dentes);
		setCorPelo(corPelo);
	}

	public int getDentes() {
		return dentes;
	}

	public void setDentes(int dentes) {
		this.dentes = dentes;
	}

	public String getCorPelo() {
		return corPelo;
	}

	public void setCorPelo(String corPelo) {
		this.corPelo = corPelo;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(super.toString());
		builder.append(" Mamifero Dentes: ");
		builder.append(dentes);
		builder.append(" Cor Pelo: ");
		builder.append(corPelo);
		return builder.toString();
	}
	
	

}
