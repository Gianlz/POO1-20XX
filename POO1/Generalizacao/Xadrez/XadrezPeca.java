
public class XadrezPeca {
	
	private int linha;
	private int coluna;
	private boolean cor;
	private int movimentos;
	
	public XadrezPeca (boolean cor) {
		setLinha(linha);
		setColuna(coluna);
		setCor(cor);
		setMovimentos(movimentos);
	}

	public int getLinha() {
		return linha;
	}

	public void setLinha(int linha) {
		this.linha = linha;
	}

	public int getColuna() {
		return coluna;
	}

	public void setColuna(int coluna) {
		this.coluna = coluna;
	}

	public boolean isCor() {
		return cor;
	}

	public void setCor(boolean cor) {
		this.cor = cor;
	}

	public int getMovimentos() {
		return movimentos;
	}

	public void setMovimentos(int movimentos) {
		this.movimentos = movimentos;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("XadrezPeca [linha=");
		builder.append(linha);
		builder.append(", coluna=");
		builder.append(coluna);
		builder.append(", cor=");
		builder.append(cor);
		builder.append(", movimentos=");
		builder.append(movimentos);
		builder.append("]");
		return builder.toString();
	}
	
	

}
