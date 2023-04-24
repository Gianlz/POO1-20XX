package com.gian.DTO;
import java.util.ArrayList;

public class Candidatos extends Pessoas {
	private ArrayList<String> candidato = new ArrayList<String>();

	public Candidatos() {

	}

	public ArrayList<String> getCandidato() {
		return candidato;
	}

	public void setCandidato(ArrayList<String> candidato) {
		this.candidato = candidato;
	}

	public void lista(String cand){
		candidato.add(cand);
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Candidatos = ");
		builder.append(candidato);

		return builder.toString();
	}


	
	
	


	
	
}
