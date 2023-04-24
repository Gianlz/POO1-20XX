package Pessoas;

public class PessoaFisica extends Pessoa {

	private String cpf;
	private String estadoCivil;

	public PessoaFisica(String nome, String endereco, String cpf, String estadoc) {
		super(nome, endereco);
		setCpf(cpf);
		setEstadoCivil(estadoc);
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getEstadoCivil() {
		return estadoCivil;
	}

	public void setEstadoCivil(String estadoCivil) {
		this.estadoCivil = estadoCivil;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(super.toString());
		builder.append(" Cpf=");
		builder.append(cpf);
		builder.append(" Estado Civil=");
		builder.append(estadoCivil);
		builder.append(" ");
		return builder.toString();
	}

}