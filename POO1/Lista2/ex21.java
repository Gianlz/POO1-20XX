import java.util.Scanner;

public class ex21 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		byte dia;
	    byte mes;
	    int ano;
	    String data;
	    
	    System.out.print("Digite o dia: ");
	    dia = entrada.nextByte();
	    System.out.print("Digite o mês: ");
	    mes = entrada.nextByte();
	    System.out.print("Digite o ano: ");
	    ano = entrada.nextInt();
	    
	    if(dia>0 && dia<32 && mes>0 && mes<13 && ano>0 && ((mes==1 || mes==3 || mes==5 || mes==7 || mes==8 || mes==10 || mes==12) || ((mes==4 || mes==6 || mes==9 || mes==11) && dia<=30) || (mes==2 &&(dia<=29 && ano%4==0 && (ano%100!=0 || ano%400==0))|| dia<=28))){
	        data="DATA VÁLIDA";
	    }else{
	        data="DATA INVÁLIDA";
	    }
	    
	    System.out.println(+dia+"/"+mes+"/"+ano+" "+data);
	    
	    entrada.close();
	}

	}


