
public class Especialidade {
	
	private String descricao;

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Especialidade [descricao=");
		builder.append(descricao);
		builder.append("]");
		return builder.toString();
	}

}
