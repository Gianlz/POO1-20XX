
public class Conta {
	
	private String banco;
	private int agencia;
	private int numeroConta;
	private double saldo;
	
	public Conta() {
		setBanco(banco);
		setAgencia(agencia);
		setNumeroConta(numeroConta);
		setSaldo(saldo);
	}
	
	public boolean Deposito(double valor ) {
		
		if (valor > 0) {
			saldo = saldo + valor;
			
			return true;
		}
		
		else {
			return false;
		}
	}
	
	public boolean Saque(double valor ) {

		if (valor < saldo) {
			saldo = saldo - valor;
			
			return true;
		}
		
		else {
			return false;
		}
	}

	public String getBanco() {
		return banco;
	}

	public void setBanco(String banco) {
		this.banco = banco;
	}

	public int getAgencia() {
		return agencia;
	}

	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}

	public int getNumeroConta() {
		return numeroConta;
	}

	public void setNumeroConta(int numeroConta) {
		this.numeroConta = numeroConta;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Conta Banco: ");
		builder.append(banco);
		builder.append(" Agencia: ");
		builder.append(agencia);
		builder.append(" Numero Da Conta: ");
		builder.append(numeroConta);
		builder.append(" Saldo: ");
		builder.append(saldo + "\n");
		return builder.toString();
	}
	
	

	
	
	

	
	
	

}
