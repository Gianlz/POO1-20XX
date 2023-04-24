package Musica;
public class MusicaCordas extends MusicaInstrumentoMusical {
	
	public MusicaCordas () {
		
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(super.toString());
		builder.append(" Cordas ");
		return builder.toString();
	}
	
	

}
