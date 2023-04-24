import java.util.Date;

public class Operacao {
	
	private Date inicio;
	private Date fim;
	public Date getInicio() {
		return inicio;
	}
	public void setInicio(Date inicio) {
		this.inicio = inicio;
	}
	public Date getFim() {
		return fim;
	}
	public void setFim(Date fim) {
		this.fim = fim;
	}
	
	public long TempoTotal(Date inicio, Date fim) {
	 
		long tempo = (fim.getTime() - inicio.getTime());
		
        return tempo;
	}	
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Operacao [inicio=");
		builder.append(inicio);
		builder.append(", fim=");
		builder.append(fim);
		builder.append("]");
		return builder.toString();
	}

}
