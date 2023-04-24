package Nave;

public class MilleniumFalcon extends Apollo11 {
	
	private float hiperPropulsor;
	
	

	

	public MilleniumFalcon(double velocidadeMaxima, String tipoCombus, float hiper) {
		super(velocidadeMaxima, tipoCombus);
		setHiperPropulsor(hiper);
	}

	public float getHiperPropulsor() {
		return hiperPropulsor;
	}

	public void setHiperPropulsor(float hiperPropulsor) {
		this.hiperPropulsor = hiperPropulsor;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(super.toString());
		builder.append("Nave MileniumFalcom HiperPropulsor=");
		builder.append(hiperPropulsor);
		builder.append("");
		return builder.toString();
	}

	
	
	

}
