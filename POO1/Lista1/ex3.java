import java.util.Scanner;

public class ex3 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		System.out.print("Escreva seu primerio número: ");
		double num1 = entrada.nextDouble();
		System.out.print("Escreva seu segundo número: ");
		double num2 = entrada.nextDouble();
		
		System.out.println(num1 + num2);
		
	
		entrada.close();

	}

}
