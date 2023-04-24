import java.util.Scanner;

public class ex12 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		float alth = entrada.nextFloat();
		float altm = entrada.nextFloat();
		
		System.out.println((72.7*alth)-58);
		System.out.println((62.1*altm)-44.7);
		
		entrada.close();

	}

}
