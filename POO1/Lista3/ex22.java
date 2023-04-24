import java.util.Scanner;
public class ex22 {

	public static void main(String[] args) {
		/*
		 * Numa eleição existem três candidatos. Faça um programa que peça o número total de
votantes. Peça para cada votante votar e ao final mostrar o número de votos de cada
candidato.
		 */
		Scanner entrada = new Scanner(System.in);
		int num_vot = entrada.nextInt();
		int cand1 = 0;
		int cand2 = 0;
		int cand3 = 0;
		
		// Cand - 1, Cand - 2, Cand -3
		
		for(int i = 1;i <= num_vot; i++)
		{
			int voto = entrada.nextInt();
			if(voto == 1)
			{
				cand1 += 1;
			}
			else if (voto == 2)
			{
				cand2 += 1;
			}
			else if (voto == 3)
			{
				cand3 += 1;
			}
		}
		
		System.out.println("Cand 1 : " + cand1);
		System.out.println("Cand 2 : " + cand2);
		System.out.println("Cand 3 : " + cand3);
		entrada.close();
	}

}
