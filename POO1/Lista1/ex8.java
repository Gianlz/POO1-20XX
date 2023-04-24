import java.util.Scanner;

public class ex8 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite quanto ganha por hora e quantas horas trabalha: ");
		
		float ganho = entrada.nextFloat();
		float hora = entrada.nextFloat();
		
		System.out.println(ganho * hora + "R$");
		
		entrada.close();
	}

}
