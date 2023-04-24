package com.gian.main;
import com.gian.DTO.Pessoas;
import com.gian.BO.pessoasBO;
import com.gian.BO.candidatoBO;
import com.gian.DTO.Candidatos;
import java.util.List;
import java.util.ArrayList;



import java.util.Scanner;
public class voteMain {

	public static void main(String[] args) {

		// Inicializar
		Scanner entrada = new Scanner(System.in);
		pessoasBO PBO = new pessoasBO();
		candidatoBO CBO = new candidatoBO();
		Pessoas pessoas = new Pessoas();


		
		
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
			System.out.println("Em quem ou em que deseja votar?\n");
			// Lista candidatos
			List<Candidatos> lista = new ArrayList<Candidatos>();
			lista = CBO.pesquisarTodos();	
			for (Candidatos cand : lista) {
				System.out.println(cand.toString());
			}
			pessoas.setVoto(entrada.nextInt());
			System.out.println("\n");
			entrada.nextLine();
			if (PBO.existe(pessoas) == true ) {
				System.out.println("Erro -  Pessoa duplicada");
			}else if (PBO.inserir(pessoas)) {
				if(pessoas.getSexo().equals("M")) {
					
				System.out.println("Inserido com Sucesso");
			}
			
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
		
		System.out.println("Digite quantos perfis deseja alterar");
		num = entrada.nextInt();
		entrada.nextLine();
		for (int i = 0; i < num; i++) {
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

		p.setVoto(entrada.nextInt());
		PBO.alterar(p);
		}
		entrada.close();
		System.out.println("\nFinalizado a OPERAÇÃO");
		


		List<Pessoas> lista = new ArrayList<Pessoas>();
		lista = PBO.pesquisarTodos();	
		for (Pessoas pes : lista) {
			System.out.println(pes.toString());
		}

		

}
	}
