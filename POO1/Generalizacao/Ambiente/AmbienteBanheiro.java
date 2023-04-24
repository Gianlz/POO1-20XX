package Ambiente;


public class AmbienteBanheiro extends Ambiente {
	
	private boolean banheira;
	
	public AmbienteBanheiro (float area) {
		super(area);
	}

	public boolean isBanheira() {
		return banheira;
	}

	public void setBanheira(boolean banheira) {
		this.banheira = banheira;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(super.toString());
		builder.append(" Banheiro Banheira: ");
		builder.append(banheira);
		return builder.toString();
	}
	
	

}
