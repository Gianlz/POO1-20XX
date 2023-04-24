import java.util.ArrayList;
import java.util.List;

public class ListaPessoas {
	
	List<Pessoa> lista = new ArrayList<Pessoa>();

	public List<Pessoa> getLista() {
		return lista;
	}

	public void setLista(List<Pessoa> lista) {
		this.lista = lista;
	}
	
	public boolean add(Pessoa pessoa) {
		lista.add(pessoa);
		return true;
	}
	
	public boolean rm(Pessoa nome) {
		lista.remove(nome);
		return true;
	}
	
	public boolean NomeIgual(Pessoa nome) {
		
		for (int i = 0; i < lista.size(); i++) {
			if(nome.getNome() == lista.listIterator(i).next().getNome()) {
				
				return false;
			}
		}
		return true;
	}
	
	public String BuscaEmail(Pessoa dominio) {
		StringBuilder builder = new StringBuilder();
		
		for (int i = 0; i < lista.size(); i++) {
			
			lista.listIterator(i).next().getDominio();
			builder.append("Dominío [email= ");
			builder.append(dominio);
		}
		return builder.toString();
	}
	
	public String ProcuraNome(Pessoa nome) {
		StringBuilder builder = new StringBuilder();
		
		for (int i = 0; i < lista.size(); i++) {
			
			lista.listIterator(i).next().getNome();
			
			String procura = "%" + nome + "%";
			nome.setNome(procura);
			
			builder.append("Pessoa [nome= ");
			builder.append(nome);
		}
		return builder.toString();
	}
	
	public String BuscarIdade(Pessoa idade) {
		StringBuilder builder = new StringBuilder();
		
		for (int i = 0; i < lista.size(); i++) {
			
			if(idade.getIdade() == lista.listIterator(i).next().getIdade()) {
				
				builder.append("Pessoa [Idade= ");
				builder.append(idade);
			}
		}
		return builder.toString();
	}
	
	public String Aniversario(Pessoa mes) {
		
		StringBuilder builder = new StringBuilder();
			
			if(mes.getMes() == 1) 
				builder.append("Janeiro");
			else if (mes.getMes() == 2)
				builder.append("Fevereiro");
			else if (mes.getMes() == 3)
				builder.append("Março");
			else if (mes.getMes() == 4)
				builder.append("Abril");
			else if (mes.getMes() == 5)
				builder.append("Maio");
			else if (mes.getMes() == 6)
				builder.append("Junho");
			else if (mes.getMes() == 7)
				builder.append("Julho");
			else if (mes.getMes() == 8)
				builder.append("Agosto");
			else if (mes.getMes() == 9)
				builder.append("Setembro");
			else if (mes.getMes() == 10)
				builder.append("Outubro");
			else if (mes.getMes() == 11)
				builder.append("Novembro");
			else 
				builder.append("Dezembro");
				
		return builder.toString();
	}
	
	

}
