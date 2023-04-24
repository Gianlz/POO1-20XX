package com.gian.main;
import com.gian.DTO.Pessoas;
import com.gian.DTO.Votantes;
import com.gian.DTO.Candidatos;
import java.time.LocalDate;
import java.util.Scanner;
public class voteMain {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		// Números de candidatos
		System.out.println("Digite o número de Candidatos a serem cadastrados");
		int num = entrada.nextInt();
		entrada.nextLine();
		// Salvar candidatos
		Candidatos c = new Candidatos();
		
		for (int i = 0; i < num; i++) {
			System.out.println("Digite seu " + (i+1) + " Candidato");
			String cand = entrada.nextLine();
			c.lista(cand);
		}
		entrada.close();
		
		System.out.println("\n" + c.getCandidato() + "\n");
		

		Pessoas p = new Pessoas();
		
		// Instanciar datas
		LocalDate now = LocalDate.now();
		

		// Pegar dados do votante + voto
		p.setNome("Gianluca");
		p.setIdade(19);
		p.setSexo("M");
		p.setCpf("000.000.000-00");
		p.setData(now);
		System.out.println(p.toString());
		
		// Mostrar Resultados da votação
		Votantes v = new Votantes();
		
		v.setVotoFem(54);
		v.setVotoMasc(34);
		int F = v.getVotoFem();
		int M = v.getVotoMasc();
		v.setVotos(v.votosCont());
		
		System.out.println(v.toString());
		

	}

}
