import java.util.Scanner;

public class ex6 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		double raio = entrada.nextDouble();
		double area = (3.14*(raio*raio));
		
		System.out.println("Área: " + area);
		
		
		entrada.close();
	}

}
