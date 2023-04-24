import java.util.Scanner;
import static java.lang.Math.round;

public class ex16 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.print("Informe os metros: ");
		float metro = entrada.nextFloat();
		float lata = metro / 108;
		float bufunfa = 80 * round(lata);
		float bufunfa2 = 25 * round(lata);
		System.out.println("Quantidade de Tintas:" + round(lata));		
		System.out.println("Quantidade Gasta: " + bufunfa);
		System.out.println("Quantidade Gasta com Galões:" + bufunfa2);
		entrada.close();

	}

}