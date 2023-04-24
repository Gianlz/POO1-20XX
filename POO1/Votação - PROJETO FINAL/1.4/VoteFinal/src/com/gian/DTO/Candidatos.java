package com.gian.DTO;


public class Candidatos extends Pessoas {
	private String candidato;

	



	public Candidatos() {

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
		builder.append("Candidatos = ");
		builder.append(candidato);

		return builder.toString();
	}


	
	
	


	
	
}
