import java.util.Scanner;
public class ex17 {

	public static void main(String[] args) {
		 Scanner entrada = new Scanner(System.in);       
	        System.out.println("Entre com um numero ");
	        int num = entrada.nextInt();       
	        for(int i = 2; i <= num; i++) {
	            boolean primo = true;        
	            for(int j = 2; j < i; j++) {            
	                if(i % j == 0) {
	                    primo = false;
	                }
	            }
	            if(primo) {
	                System.out.println(i);
	          entrada.close();
	            }          
	        }

	}

}
