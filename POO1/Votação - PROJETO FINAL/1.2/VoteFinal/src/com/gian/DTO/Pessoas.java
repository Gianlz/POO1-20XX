package com.gian.DTO;
import java.time.LocalDate;
public class Pessoas {
	private String nome; // MAX - 45
	private int idade;
	private String sexo; // MAX - 1
	private String cpf; // MAX - 11
	private LocalDate data;
	


	public Pessoas() {

	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
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

	public LocalDate getData() {
		return data;
	}

	public void setData(LocalDate data) {
		this.data = data;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Nome= ");
		builder.append(nome);
		builder.append(" | Idade= ");
		builder.append(idade);
		builder.append(" | Sexo= ");
		builder.append(sexo);
		builder.append(" | cpf= ");
		builder.append(cpf);
		builder.append(" | data= ");
		builder.append(data);
		return builder.toString();
	}
	

	// Pegar data atual
	// LocalDate today = LocalDate.now();
	

}
