import java.util.Scanner;
public class ex9 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		float faren = entrada.nextFloat();
		float celsius = (5*(faren-32)/9);
		System.out.println(celsius);
		
		
		entrada.close();

	}

}
