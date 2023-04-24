
public class ContaMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Conta conta = new Conta();
		conta.setBanco("NuBank");
		conta.setAgencia(8516);
		conta.setNumeroConta(123);
		conta.setSaldo(400.00);
		conta.Deposito(50);
		conta.Saque(40);
		System.out.println(conta);
		
		ContaSimples cs = new ContaSimples ();
		cs.setBanco("Bradesco");
		cs.setAgencia(4207);
		cs.setNumeroConta(987);
		cs.setSaldoPoupanca(700);
		cs.Deposito(300);
		cs.Saque(100.4);
		System.out.println(cs);
		
		ContaEspecial ce = new ContaEspecial();
		ce.setBanco("NG Ca$h");
		ce.setAgencia(9911);
		ce.setNumeroConta(456);
		ce.setSaldo(1200);
		ce.setDiasSemJuros(7);
		ce.setLimite(200.50);
		System.out.println(ce);
		
		
		
		

	}

}
