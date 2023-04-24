package Escola;

public class escolaMain {

	public static void main(String[] args) {
		Pessoa p = new Pessoa(372, "Gianluca", "riosul");
		
		System.out.println(p.toString());

		Professor prof = new Professor(234, "Cleber", "riosul", "matematica");
		
		System.out.println(prof.toString());
		
		Aluno a = new Aluno(435, "Gian", "riosul", 92831232);
		
		System.out.println(a.toString());
	}

}
