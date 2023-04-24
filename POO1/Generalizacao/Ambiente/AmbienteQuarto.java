package Ambiente;

public class AmbienteQuarto extends Ambiente {
	
	private int capacidade;
	
	public AmbienteQuarto (float area) {
		super(area);
	}

	public int getCapacidade() {
		return capacidade;
	}

	public void setCapacidade(int capacidade) {
		this.capacidade = capacidade;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(super.toString());
		builder.append(" Quarto Capacidade: ");
		builder.append(capacidade);
		return builder.toString();
	}
	
	

}
