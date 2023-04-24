
public class ex12 {

	public static void main(String[] args) {
		float aux = 0;
		float antiga = 0;
		float nova = 1;

		
		for(int i = 1; i <= 19;i++)
		{
			System.out.println(nova);
			aux = antiga;
			antiga = nova;
			nova = nova + aux;
		}
		

	}

}
