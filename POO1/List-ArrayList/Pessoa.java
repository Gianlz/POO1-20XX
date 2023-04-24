
public class Pessoa {
	
	private String nome;
	private String email;
	private String dominio;
	private int idade;
	private int mes;
	
	public Pessoa(String nome, String email, String dominio, int idade, int mes) {
		super();
		this.nome = nome;
		this.email = email;
		this.dominio = dominio;
		this.idade = idade;
		this.mes = mes;
	}
	
	public boolean ValidaMes(int mes) {
		
		if(mes < 0 || mes > 12) {
			return false;
		}
		return true;
	}

	public boolean ValidaNome(String nome) {
		
		if(nome.length() > 2) {
			return true;
		}
		
		return false;
	}
	
	public boolean alt(Pessoa pessoa) {
			setNome(nome);
			setEmail(email);
			setDominio(dominio);
			setIdade(idade);
		return true;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getDominio() {
		return dominio;
	}

	public void setDominio(String dominio) {
		this.dominio = dominio;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public int getMes() {
		return mes;
	}

	public void setMes(int mes) {
		this.mes = mes;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Pessoa [nome= ");
		builder.append(nome);
		builder.append(", email= ");
		builder.append(email);
		builder.append(", idade= ");
		builder.append(idade);
		builder.append(", mes= ");
		builder.append(mes);
		builder.append("]");
		return builder.toString();
	}

	

	

	

}
