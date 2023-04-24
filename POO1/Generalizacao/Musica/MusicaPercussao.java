package Musica;
public class MusicaPercussao extends MusicaPrato {
	
	public MusicaPercussao () {
		
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(super.toString());
		builder.append(" Percussao ");
		return builder.toString();
	}
	
	
 
}
