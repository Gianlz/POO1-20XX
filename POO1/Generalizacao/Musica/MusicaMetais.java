package Musica;
public class MusicaMetais extends MusicaInstrumentoMusical {
	
	public MusicaMetais () {
		
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(super.toString());
		builder.append(" Metais ");
		return builder.toString();
	}

}
