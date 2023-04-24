package Item;

public class CD extends Midia {
	
	private int faixas;
	private String artista;
	private String album;
	
	

	public CD(int codigo, String descricao, String gravadora, float duracao, int faixa, String artista, String album) {
		super(codigo, descricao, gravadora, duracao);
		setFaixas(faixa);
		setArtista(artista);
		setAlbum(album);
	}

	public int getFaixas() {
		return faixas;
	}

	public void setFaixas(int faixas) {
		this.faixas = faixas;
	}

	public String getArtista() {
		return artista;
	}

	public void setArtista(String artista) {
		this.artista = artista;
	}

	public String getAlbum() {
		return album;
	}

	public void setAlbum(String album) {
		this.album = album;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(super.toString());
		builder.append("Faixas: ");
		builder.append(faixas);
		builder.append(" Artista: ");
		builder.append(artista);
		builder.append(" Album: ");
		builder.append(album);
		return builder.toString();
	}
	
	

}