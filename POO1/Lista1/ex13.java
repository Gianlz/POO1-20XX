import java.util.Scanner;

public class ex13 {

	public static void main(String[] args) {
		

		Scanner entrada = new Scanner(System.in);
		System.out.print("Informe o Peso do Peixe: ");
		float peixe = entrada.nextFloat();
		float exc = peixe - 50;
		float multa = exc * 4;
		System.out.println("Multa: " + multa);
		entrada.close();

	}

}