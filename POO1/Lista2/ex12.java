import java.util.Scanner;

public class ex12 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		double salarioB = entrada.nextDouble();
		double salarioN = 0;
		double porc = 0;
		
		if (salarioB <= 280)
		{
			porc = salarioB * 0.20;
			salarioN = salarioB + porc;
			System.out.println(salarioB + " 20% " + porc + " " + salarioN);
		}
		else if(salarioB > 280 && salarioB <= 700)
			{
				porc = salarioB * 0.15;
				salarioN = salarioB + porc;
				System.out.println(salarioB + " 15% " + porc + " " + salarioN);
			}
			else if(salarioB > 700 && salarioB <= 1500)
			{
				porc = salarioB * 0.10;
				salarioN = salarioB + porc;
				System.out.println(salarioB + " 10% " + porc + " " + salarioN);
			}
			else if (salarioB > 1500)
			{
				porc = salarioB * 0.05;
				salarioN = salarioB + porc;
				System.out.println(salarioB + " 5% " + porc + " " + salarioN);
			}
	
		entrada.close();
	}
		
}
