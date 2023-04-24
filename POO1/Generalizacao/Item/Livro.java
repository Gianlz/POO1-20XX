package Item;

public class Livro extends Item {
	
	private String autor;
	
	

	public Livro(int codigo, String descricao, String autor) {
		super(codigo, descricao);
		setAutor(autor);
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(super.toString());
		builder.append("Autor: ");
		builder.append(autor);
		return builder.toString();
	}
	
	

}