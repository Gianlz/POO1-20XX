package com.gian.DTO;
import java.time.LocalDate;
public class Pessoas {
	private String nome; // MAX - 45
	private String nascimento;
	private String sexo; // MAX - 1
	private String cpf; // MAX - 11
	private int voto;


	

	public Pessoas(String cpf) {

		this.cpf = cpf;

	}
	




	public Pessoas(String nome, String nascimento, String sexo, String cpf, int voto) {
		this.nome = nome;
		this.nascimento = nascimento;
		this.sexo = sexo;
		this.cpf = cpf;
		this.voto = voto;

	}





	public Pessoas() {

	}
	


	
	public int getVoto() {
		return voto;
	}



	public void setVoto(int voto) {
		this.voto = voto;
	}



	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNascimento() {
		return nascimento;
	}

	public void setNascimento(String nascimento) {
		this.nascimento = nascimento;
	}

	public String getSexo() {
		return sexo;
	}
  
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	// Converte data para String
	public static String dateToString(LocalDate date) {
		String Sdate = date.toString();
		return Sdate;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Nome= ");
		builder.append(nome);
		builder.append(" | Idade= ");
		builder.append(nascimento);
		builder.append(" | Sexo= ");
		builder.append(sexo);
		builder.append(" | cpf= ");
		builder.append(cpf);
		return builder.toString();
	}
	

	// Pegar data atual
	// LocalDate today = LocalDate.now();
	

}
