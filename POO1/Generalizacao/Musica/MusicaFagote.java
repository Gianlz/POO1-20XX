package Musica;
public class MusicaFagote extends MusicaMadeiras {
	
	public MusicaFagote () {
		
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(super.toString());
		builder.append(" Fagote ");
		return builder.toString();
	}

}
