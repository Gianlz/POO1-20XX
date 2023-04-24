import java.util.Scanner;

public class ex3
{
	public static void main(String[] args) {

	Scanner entrada = new Scanner(System.in);
	
	String nome = entrada.nextLine();
	int idade = entrada.nextInt();
	double salario = entrada.nextDouble();
	String sexo = entrada.nextLine();
	String estadoc = entrada.nextLine();
	
	
	while(nome.length()  <= 3)
	{
		System.out.println("Digite seu nome: ");
		nome = entrada.nextLine();
	}
	
	while(idade < 0 && idade > 150)
	{
		System.out.println("Digite sua idade: ");
		idade = entrada.nextInt();
	}
	
	while(salario < 0)
	{
		System.out.println("Digite seu salario: ");
		salario = entrada.nextDouble();
	}
	/*while(sexo != "f" || sexo != "m")
	{
		System.out.println("Digite seu sexo: ");
		sexo = entrada.nextLine();
	}*/
	while(estadoc != "s" || estadoc != "c" || estadoc != "v" || estadoc != "d")
	{
		System.out.println("Digite seu estado civil: ");
		estadoc = entrada.nextLine();
	}
	
	
	entrada.close();
		
		
	}
	
}