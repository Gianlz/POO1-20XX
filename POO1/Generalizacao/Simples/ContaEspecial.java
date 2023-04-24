
public class ContaEspecial extends Conta {
	
	private int diasSemJuros;
	private double  limite;
	
	public ContaEspecial() {
		setDiasSemJuros(diasSemJuros);
		setLimite(limite);
	}

	public int getDiasSemJuros() {
		return diasSemJuros;
	}

	public void setDiasSemJuros(int diasSemJuros) {
		this.diasSemJuros = diasSemJuros;
	}

	public double getLimite() {
		return limite;
	}

	public void setLimite(double limite) {
		this.limite = limite;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(super.toString());
		builder.append("Conta Especial Dias Sem Juros: ");
		builder.append(diasSemJuros);
		builder.append(" Limite: ");
		builder.append(limite);
		return builder.toString();
	}
	
	

}
