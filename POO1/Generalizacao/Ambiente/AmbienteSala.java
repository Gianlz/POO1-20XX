package Ambiente;

public class AmbienteSala extends Ambiente {
	
	private boolean tv;
	
	public AmbienteSala (float area) {
		super(area);
	}

	public boolean isTv() {
		return tv;
	}

	public void setTv(boolean tv) {
		this.tv = tv;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(super.toString());
		builder.append(" Sala Tv: ");
		builder.append(tv);
		return builder.toString();
	}

	

}
