import java.util.Scanner;

public class ex11 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		float altura = entrada.nextFloat();
		
		System.out.println("O peso ideal eh: " + (72.7*altura- 58));
		
		entrada.close();

	}

}
