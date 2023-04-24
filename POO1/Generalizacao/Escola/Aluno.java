package Escola;

public class Aluno extends Pessoa {
	private int matricula;

	
	
	
	public Aluno(int codigo, String nome, String endereco, int matricula) {
		super(codigo, nome, endereco);
		setMatricula(matricula);
	}

	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(super.toString());
		builder.append("Matricula=");
		builder.append(matricula);

		return builder.toString();
	}
	
	
	
}
