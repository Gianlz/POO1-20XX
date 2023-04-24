
import java.util.Scanner;

public class ex14 {

	public static void main(String[] args) {
	
		Scanner entrada = new Scanner(System.in);
		System.out.print("Informe a quantia ganha por horas trabalhadas: ");
		float trab = entrada.nextFloat();
		System.out.print("Informe as horas trabalhadas no mês: ");
		float trab1 = entrada.nextFloat();
		float salarioB = (trab * trab1);
		float IR = (salarioB * 11) / 100;
		float INSS = (salarioB * 8) / 100;
		float sin = (salarioB * 5) / 100;
		float salarioL = (salarioB - IR - INSS - sin);
		System.out.println("Salário Bruto: " + salarioB);
		System.out.println("Desconto INSS: " + INSS);
		System.out.println("Desconto Sindicato: " + sin);
		System.out.println("Salário Liquido: " + salarioL);
		entrada.close();
	}

}