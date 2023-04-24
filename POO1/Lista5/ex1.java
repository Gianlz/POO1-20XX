package com.gian.a1;

import java.util.Scanner;

public class ex1 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		int soma = 0;
		double media = 0;
		int maior = 0;
		int menor = 0;
		int kpar = 0;
		int kimp = 0;
		int principal = 0;
		int secundaria = 0;

		System.out.println("Digite um n entre 3 e 11 incluindo 3 e 11: ");
		int TAM = entrada.nextInt();
		if (TAM % 2 == 1 && TAM >= 3 && TAM <= 11) {
			int matriz[][] = new int[TAM][TAM];
			for (int i = 0; i < TAM; i++) {
				for (int j = 0; j < TAM; j++) {
					matriz[i][j] = entrada.nextInt();
					soma = soma + matriz[i][j];
					if (maior == 0 || menor == 0) {
						maior = matriz[i][j];
						menor = matriz[i][j];
					} else if (menor > matriz[i][j]) {
						menor = matriz[i][j];
					} else if (maior < matriz[i][j]) {
						maior = matriz[i][j];
					}
					if (matriz[i][j] % 2 == 0) {
						kpar = kpar + 1;
					} else if (matriz[i][j] % 2 == 1) {
						kimp = kimp + 1;
					}
					if (i == j) {
						principal += matriz[i][j];
					}

					else if ((i + j) == (TAM - 1)) {
						secundaria += matriz[i][j];
					}

				}
			}
			for (int i = 0; i < TAM; i++) {
				System.out.println("");
				for (int j = 0; j < TAM; j++) {
					System.out.print(matriz[i][j] + "|");
				}
			}
		} else {
			System.out.println("Número em um intervalo inválido");
		}
		media = soma / (TAM * TAM);

		System.out.println("\n");
		System.out.println("Média = " + media);
		System.out.println("Soma = " + soma);
		System.out.println("Maior = " + maior);
		System.out.println("Menor = " + menor);
		System.out.println("Pares = " + kpar);
		System.out.println("Impares = " + kimp);
		System.out.println("Diagonal P " + principal);
		System.out.println("Diagonal S " + secundaria);

		entrada.close();

	}

}
