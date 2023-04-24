package Animal;

public class Animal {
	
	private double altura;
	private int peso;
	
	public Animal() {
		setAltura(altura);
		setPeso(peso);
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public int getPeso() {
		return peso;
	}

	public void setPeso(int peso) {
		this.peso = peso;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Animal Altura: ");
		builder.append(altura);
		builder.append(" Peso: ");
		builder.append(peso);
		return builder.toString();
	}
	
	
	
	
}
