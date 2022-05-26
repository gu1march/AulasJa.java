
public class Mouse {
	
	private boolean funciona;
	private int qtdBtoes;
	private String tamanho;
	
	
	public Mouse(boolean funciona, int qtdBtoes, String tamanho) {
		this.funciona = funciona;
		this.qtdBtoes = qtdBtoes;
		this.tamanho = tamanho;
	}
	
	public boolean isFunciona() {
		return funciona;
	}
	public void setFunciona(boolean funciona) {
		this.funciona = funciona;
	}
	public int getQtdBtoes() {
		return qtdBtoes;
	}
	public void setQtdBtoes(int qtdBtoes) {
		this.qtdBtoes = qtdBtoes;
	}
	public String getTamanho() {
		return tamanho;
	}
	public void setTamanho(String tamanho) {
		this.tamanho = tamanho;
	}
	
	@Override
	public String toString() {
		return "Mouse: funciona = " + funciona + ", QtdBotoes = " + qtdBtoes + ", Tamanho = " + tamanho + ".\n";
	}
	
	
	
	
	
	
}
