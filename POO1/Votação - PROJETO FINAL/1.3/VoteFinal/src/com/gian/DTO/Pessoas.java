package com.gian.DTO;
import java.time.LocalDate;
public class Pessoas {
	private String nome; // MAX - 45
	private LocalDate nascimento;
	private String sexo; // MAX - 1
	private String cpf; // MAX - 11

	

	public Pessoas(String nome, LocalDate nascimento, String sexo, String cpf) {
		this.nome = nome;
		this.nascimento = nascimento;
		this.sexo = sexo;
		this.cpf = cpf;
	}
	
	public Pessoas() {

	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public LocalDate getNascimento() {
		return nascimento;
	}

	public void setNascimento(LocalDate nascimento) {
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
