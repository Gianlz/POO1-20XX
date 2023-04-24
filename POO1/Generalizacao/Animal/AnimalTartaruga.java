package Animal;

public class AnimalTartaruga extends AnimalReptil {
	
	private int tamanhoCasco;
	
	public AnimalTartaruga () {
		setTamanhoCasco(tamanhoCasco);
	}

	public int getTamanhoCasco() {
		return tamanhoCasco;
	}

	public void setTamanhoCasco(int tamanhoCasco) {
		this.tamanhoCasco = tamanhoCasco;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(super.toString());
		builder.append(" Tartaruga = Tamanho Casco: ");
		builder.append(tamanhoCasco);
		return builder.toString();
	}
	
	

}
