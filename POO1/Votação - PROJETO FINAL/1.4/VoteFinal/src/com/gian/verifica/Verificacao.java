package com.gian.verifica;
import com.gian.DTO.Pessoas;


public class Verificacao {
	Pessoas p = new Pessoas();
	
	public boolean valida() {
		if(p.getNome() == null || p.getCpf() == null || p.getNascimento() == null || p.getSexo() == null) {
			return false;
			
		}
		return true;
	}
}
