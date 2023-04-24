package Item;

public class Item {
	
	private int codigo;
	private String descricao;
	
	

	public Item(int codigo, String descricao) {
		setCodigo(codigo);
		setDescricao(descricao);
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Codigo: ");
		builder.append(codigo);
		builder.append(" Descricao: ");
		builder.append(descricao);
		builder.append(" ");
		return builder.toString();
	}
	
	
	
	

}