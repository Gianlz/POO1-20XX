import java.util.List;

public class PessoaMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ListaPessoas l = new ListaPessoas();
		
		Pessoa p = new Pessoa("André", "poki66 @gmail.com", "@gmail.com", 19, 2);
		
		l.add(p);
		
		 p = new Pessoa("Paulin", "paulin79 @hotmail.com", "@hotmail.com", 14, 9);
		
		l.add(p);
		
		p = new Pessoa("Paulin", "paulin79 @yahoo.com", "@yahoo.com", 28, 10);
		
		l.add(p);
		
		
		List<Pessoa> lista = l.getLista();
		
		for (Pessoa item : lista)
			 System.out.println(item.toString());
			
	}

}
