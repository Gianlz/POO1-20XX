
public class Atendimento extends Operacao {
	
	private int prioridade;
	private int estado;
	protected Medico medico;
	protected Paciente paciente;
	
	public int getPrioridade() {
		return prioridade;
	}
	public void setPrioridade(int prioridade) {
		this.prioridade = prioridade;
	}
	public int getEstado() {
		return estado;
	}
	public void setEstado(int estado) {
		this.estado = estado;
	}
	
	public Medico getMedico() {
		return medico;
	}
	public void setMedico(Medico medico) {
		this.medico = medico;
	}
	public Paciente getPaciente() {
		return paciente;
	}
	public void setPaciente(Paciente paciente) {
		this.paciente = paciente;
	}
	
	public void calculaPrioridade(boolean[] respostas) {
		
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Atenimento [prioridade=");
		builder.append(prioridade);
		builder.append(", estado=");
		builder.append(estado);
		builder.append(", medico=");
		builder.append(medico);
		builder.append(", paciente=");
		builder.append(paciente);
		builder.append("]");
		return builder.toString();
	}

}
