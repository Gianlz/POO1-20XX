package Musica;
public class MusicaTambor extends MusicaPrato {
	
	public MusicaTambor () {
		
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(super.toString());
		builder.append(" Tambor ");
		return builder.toString();
	}

}
