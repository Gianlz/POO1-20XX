package Pessoas;

public class Pessoa {
	
	private String nome;
	private String endereco;
	
	
	public Pessoa(String nome, String endereco) {
		setNome(nome);
		setEndereco(endereco);
	}

	
	public String getEndereco() {
		return endereco;
	}


	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}


	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}


	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Nome=");
		builder.append(nome);
		builder.append(" Endereco=");
		builder.append(endereco);
		return builder.toString();
	}

	
	
	

}
