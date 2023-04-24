package Animal;

public class AnimalReptil extends Animal {
	
	private String tipoPele;
	
	public AnimalReptil () {
		setTipoPele(tipoPele);
	}

	public String getTipoPele() {
		return tipoPele;
	}

	public void setTipoPele(String tipoPele) {
		this.tipoPele = tipoPele;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(super.toString());
		builder.append(" Reptil Tipo Pele: ");
		builder.append(tipoPele);
		return builder.toString();
	}
	
	
	

}
