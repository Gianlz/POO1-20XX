import java.util.Scanner;

public class ex2 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite um número: ");
		
		double numdob = entrada.nextDouble();
		
		System.out.println("O número informado foi " + numdob);
		
		entrada.close();
		
	}

}
