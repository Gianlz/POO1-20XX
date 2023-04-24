
public class BombaDisel extends Bomba {
	
	private double totalLitros;
	private float valorLitro;
	
	public BombaDisel () {
		setTotalLitros(totalLitros);
		setValorLitro(valorLitro);
	}
	
	public boolean AbastecerPorLitro(int litros) {
		
		if(litros <= totalLitros) {
			totalLitros = totalLitros - litros;
			
			return true;
		}
		
		else {
			return false;
		}
	}
	
	public boolean AbastecerPorValor(double valor) {
		
		if(valor >= 0) {
			totalLitros = totalLitros * valor;
			
			return true;
		}
		
		else {
			return false;
		}
	}

	public double getTotalLitros() {
		return totalLitros;
	}

	public void setTotalLitros(double totalLitros) {
		this.totalLitros = totalLitros;
	}

	public float getValorLitro() {
		return valorLitro;
	}

	public void setValorLitro(float valorLitro) {
		this.valorLitro = valorLitro;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("BombaDisel [totalLitros=");
		builder.append(totalLitros);
		builder.append(", valorLitro=");
		builder.append(valorLitro);
		builder.append("]");
		return builder.toString();
	}

}
