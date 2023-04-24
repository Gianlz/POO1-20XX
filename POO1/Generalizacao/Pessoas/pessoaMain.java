package Pessoas;

public class pessoaMain {

	public static void main(String[] args) {
		
		Pessoa p = new Pessoa("Gianluca", "riosul");
		
		PessoaFisica pf = new PessoaFisica("Gianluca", "riosul", "234324234", "solteiro");
		
		PessoaJuridica pj = new PessoaJuridica("Gianluca", "riosul", "2934832094234", "Riosul CO");
		
		
		System.out.println(p.toString());
		System.out.println(pf.toString());
		System.out.println(pj.toString());

	}

}
