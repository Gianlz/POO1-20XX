
public class ContaSimples extends Conta {
	
	private double saldoPoupanca;
	
	public ContaSimples() {
		setSaldoPoupanca(saldoPoupanca);
	}

	public boolean Deposito(double valor ) {
		
		if (valor > 0) {
			saldoPoupanca = saldoPoupanca + valor;
			
			return true;
		}
		
		else {
			return false;
		}
	}
	
	public boolean Saque(double valor ) {

		if (valor < saldoPoupanca) {
			saldoPoupanca = saldoPoupanca - valor;
			
			return true;
		}
		
		else {
			return false;
		}
	}

	public double getSaldoPoupanca() {
		return saldoPoupanca;
	}

	public void setSaldoPoupanca(double saldoPoupanca) {
		this.saldoPoupanca = saldoPoupanca;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(super.toString());
		builder.append("Conta Simples Saldo Poupanca: ");
		builder.append(saldoPoupanca + "\n");
		return builder.toString();
	}
	
	
}
