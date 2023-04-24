import java.util.Scanner;

public class ex5 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite sua medida em metros");
		double met = entrada.nextDouble();
		
		System.out.println((met*100) + "cm");
		
		
		entrada.close();
		
	}

}
