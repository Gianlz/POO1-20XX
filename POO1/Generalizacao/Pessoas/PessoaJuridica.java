package Pessoas;

public class PessoaJuridica extends Pessoa{

	private String cnpj;
	private String tipoEmpresa;

	

	public PessoaJuridica(String nome, String enderec, String cnpj, String empresa) {
		super(nome, enderec);
		setCnpj(cnpj);
		setTipoEmpresa(empresa);
		
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public String getTipoEmpresa() {
		return tipoEmpresa;
	}

	public void setTipoEmpresa(String tipoEmpresa) {
		this.tipoEmpresa = tipoEmpresa;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(super.toString());
		builder.append(" Cnpj=");
		builder.append(cnpj);
		builder.append(" TipoEmpresa=");
		builder.append(tipoEmpresa);
		builder.append("");
		return builder.toString();
	}

}
