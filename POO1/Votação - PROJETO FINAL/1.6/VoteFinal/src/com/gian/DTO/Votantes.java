package com.gian.DTO;

public class Votantes extends Pessoas{
	private int id;
	private int votoFem;
	private int votoMasc;

	
	
	public Votantes(int id, int votoFem) {
		

	}
	
	public Votantes(int votoMasc) {
			
	
	}

	
	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public int getVotoFem() {
		return votoFem;
	}
	public void setVotoFem(int votoFem) {
		this.votoFem = votoFem;
	}
	public int getVotoMasc() {
		return votoMasc;
	}
	public void setVotoMasc(int votoMasc) {
		this.votoMasc = votoMasc;
	}
	
	public int votosCont() {
		int soma = this.votoFem + this.votoMasc;
		return soma;
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		//builder.append(super.toString());
		builder.append("VotoFem = ");
		builder.append(votoFem);
		builder.append(" | VotoMasc = ");
		builder.append(votoMasc);
		return builder.toString();
	}
	
	
	
}
