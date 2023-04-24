import java.util.Scanner;

public class ex4 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite suas notas: ");
		float n1 = entrada.nextFloat();
		float n2 = entrada.nextFloat();
		float n3 = entrada.nextFloat();
		float n4 = entrada.nextFloat();
		
		System.out.println((n1+n2+n3+n4)/4);
		
		entrada.close();

	}

}
