package Musica;
public class MusicaPiano extends MusicaCordas {
	
public MusicaPiano () {
		
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(super.toString());
		builder.append(" Piano ");
		return builder.toString();
	}

}
