package com.gian.DTO;


public class Candidatos extends Pessoas {
	private int id;
	private String candidato;

	



	public Candidatos() {

	}



	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public String getCandidato() {
		return candidato;
	}





	public void setCandidato(String candidato) {
		this.candidato = candidato;
	}



	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Id(" );
		builder.append(id);
		builder.append(")" );
		builder.append("Candidato(");
		builder.append(candidato);
		builder.append(")\n");
		return builder.toString();
	}








	
	
	


	
	
}
