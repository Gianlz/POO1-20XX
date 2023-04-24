
public class XadrezBispo extends XadrezPeca {
	
	private int linha;
	private int coluna;
	
	public XadrezBispo (boolean cor) {
		super(cor);
		setLinha(linha);
		setColuna(coluna);
	}
	
	public boolean mover (int linha, int coluna) {
		linha = linha + linha;
		
		return true;
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

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(super.toString());
		builder.append("XadrezBispo [linha=");
		builder.append(linha);
		builder.append(", coluna=");
		builder.append(coluna);
		builder.append("]");
		return builder.toString();
	}
	
	

}
