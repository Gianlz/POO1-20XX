import java.util.Scanner;
import java.lang.Math;

public class ex19 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		double a = entrada.nextDouble();
		double b = entrada.nextDouble();
		double c = entrada.nextDouble();
		double delta = 0;
		
		 delta = (b * b) - (4 * (a * c));
		
		if (delta < 0)
		{
			System.out.println("Delta Negativo");
		}
		else {
			System.out.println(delta);
			System.out.println((-b + Math.sqrt(delta))/(2*a));
			System.out.println((-b - Math.sqrt(delta))/(2*a));
		}
		
		entrada.close();
	}

}
