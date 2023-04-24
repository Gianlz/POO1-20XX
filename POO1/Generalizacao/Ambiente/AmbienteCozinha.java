package Ambiente;


public class AmbienteCozinha extends Ambiente {
	
	private boolean microOndas;
	
	public AmbienteCozinha (float area) {
		super(area);
	}

	public boolean isMicroOndas() {
		return microOndas;
	}

	public void setMicroOndas(boolean microOndas) {
		this.microOndas = microOndas;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(super.toString());
		builder.append(" Cozinha MicroOndas: ");
		builder.append(microOndas);
		return builder.toString();
	}
	
	

}
