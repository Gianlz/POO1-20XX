package Nave;

public class NaveEspacial {
	
	private double velocidadeMaxima;
	
	public NaveEspacial ( double velocidadeMaxima) {
		setVelocidadeMaxima(velocidadeMaxima);
	}

	public double getVelocidadeMaxima() {
		return velocidadeMaxima;
	}

	public void setVelocidadeMaxima(double velocidadeMaxima) {
		this.velocidadeMaxima = velocidadeMaxima;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Nave Espacial Velocidade Maxima: ");
		builder.append(velocidadeMaxima);
		builder.append(" ");
		return builder.toString();
	}
	
	

}