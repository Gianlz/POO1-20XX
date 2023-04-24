package Musica;
public class MusicaTuba extends MusicaMetais {
	
	public MusicaTuba () {
		
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(super.toString());
		builder.append(" Tuba ");
		return builder.toString();
	}

}
