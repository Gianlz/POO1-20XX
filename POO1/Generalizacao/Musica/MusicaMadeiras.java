package Musica;
public class MusicaMadeiras extends MusicaInstrumentoMusical {
	
	public MusicaMadeiras () {
		
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(super.toString());
		builder.append(" Madeiras ");
		return builder.toString();
	}

}
