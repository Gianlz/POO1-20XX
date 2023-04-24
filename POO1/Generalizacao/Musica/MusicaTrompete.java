package Musica;
public class MusicaTrompete extends MusicaMetais {
	
	public MusicaTrompete () {
		
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(super.toString());
		builder.append(" Trompete ");
		return builder.toString();
	}

}
