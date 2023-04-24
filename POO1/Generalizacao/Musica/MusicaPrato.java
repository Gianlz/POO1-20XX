package Musica;
public class MusicaPrato extends MusicaInstrumentoMusical {
	
	public MusicaPrato () {
		
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(super.toString());
		builder.append(" Prato ");
		return builder.toString();
	}
	
	

}
