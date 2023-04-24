package Musica;
public class MusicaViolao extends MusicaCordas {
	
	public MusicaViolao () {
		
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(super.toString());
		builder.append(" Violão ");
		return builder.toString();
	}

}
