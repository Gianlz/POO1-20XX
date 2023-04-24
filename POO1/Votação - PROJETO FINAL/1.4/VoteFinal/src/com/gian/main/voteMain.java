package com.gian.main;
import com.gian.DTO.Pessoas;
import com.gian.BO.pessoasBO;
import com.gian.BO.candidatoBO;
import com.gian.DTO.Candidatos;
import com.gian.BO.votantesBO;
import com.gian.DTO.Votantes;

import java.util.Scanner;
public class voteMain {

	public static void main(String[] args) {

		// Inicializar
		Scanner entrada = new Scanner(System.in);
		pessoasBO PBO = new pessoasBO();
		candidatoBO CBO = new candidatoBO();
		Pessoas pessoas = new Pessoas();
		Votantes voto = new Votantes();
		votantesBO VBO = new votantesBO();
		
		
		// Números de candidatos
		System.out.println("Digite o número de Candidatos a serem cadastrados");
		int num = entrada.nextInt();
		
		
		// Salvar candidatos
		
		Candidatos c = new Candidatos();
		entrada.nextLine();
		for (int i = 0; i < num; i++) {
			System.out.println("Digite seu " + (i+1) + " Candidato");
			String cand = entrada.nextLine(); 
			c.setCandidato(cand);
			if (CBO.existe(c) == true ) {
				System.out.println("Erro -  Canditado duplicado");
			}else if (CBO.inserir(c)) {
				System.out.println("Inserido com Sucesso");
			}
	
		}
		
		System.out.println("\n------------------------------------\n");
		
		System.out.println("\nCandidatos:");
		//System.out.println(c.getCandidato() + "\n");
				
		System.out.println("Quantas pessoas deseja cadastrar?");
		num = entrada.nextInt();
		System.out.println("\n");
		
		
		System.out.println("\n------------------------------------\n");
		
		// Inserir Pessoas
		entrada.nextLine();
		for (int i = 0; i < num; i++) {
			System.out.println("Digite o nome do votante");
			pessoas.setNome(entrada.nextLine());
			System.out.println("Digite a data de nascimento no formato ano/mes/dia");
			pessoas.setNascimento(entrada.nextLine());
			System.out.println("Digite o Sexo (M ou F)");
			pessoas.setSexo(entrada.nextLine().toUpperCase());
			System.out.println("Digite o cpf sem formatação, ex: 00000000000");
			pessoas.setCpf(entrada.nextLine());
			System.out.println("Em quem ou em que deseja votar?");
			System.out.println("Pedro [1], Jonatah[2]");
			pessoas.setVoto(entrada.nextInt());
			if (PBO.existe(pessoas) == true ) {
				System.out.println("Erro -  Pessoa duplicada");
			}else if (PBO.inserir(pessoas)) {
				System.out.println("Inserido com Sucesso");
			}
		}

		
		
		// Exluir Pessoas
		System.out.println("Quantos perfis deseja deletar?");
		num = entrada.nextInt();
		entrada.nextLine();
		for (int i = 0; i < num; i++) {
			System.out.println("Digite o cpf que deseja exluir o perfil");
			pessoas.setCpf(entrada.nextLine());
			if (PBO.excluir(pessoas))
				System.out.println("Excluido com Sucesso");
			else
				System.out.println("Erro ao Excluir");

		
		}
		
		
		// Alterar voto
		System.out.println("Digite o cpf do indivíduo que deseja alterar o voto");
		Pessoas p = new Pessoas();
		p.setCpf(entrada.nextLine());
		System.out.println("Digite o novo nome do votante");
		p.setNome(entrada.nextLine());
		System.out.println("Digite a nova data de nascimento no formato ano/mes/dia");
		p.setNascimento(entrada.nextLine());
		System.out.println("Digite o novo Sexo (M ou F)");
		p.setSexo(entrada.nextLine().toUpperCase());
		System.out.println("Digite seu novo candidato");
		System.out.println("Pedro [1], Jonatah[2]");
		p.setVoto(entrada.nextInt());
		PBO.alterar(p);
		entrada.close();
		System.out.println("\nFinalizado a OPERAÇÃO");
		
	}

}
