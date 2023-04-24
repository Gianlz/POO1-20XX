package Musica;
public class MusicaSaxofone extends MusicaMetais {
	
public MusicaSaxofone () {
		
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(super.toString());
		builder.append(" Saxofone ");
		return builder.toString();
	}

}
