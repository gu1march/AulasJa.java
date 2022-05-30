
public class Mouse {
	
	private String funciona;
	private String qtdBtoes;
	private String tamanho;
	
	
	public Mouse(String funciona, String qtdBtoes, String tamanho) {
		this.funciona = funciona;
		this.qtdBtoes = qtdBtoes;
		this.tamanho = tamanho;
	}
	
	public String isFunciona() {
		return funciona;
	}
	public void setFunciona(String funciona) {
		this.funciona = funciona;
	}
	public String getQtdBtoes() {
		return qtdBtoes;
	}
	public void setQtdBtoes(String qtdBtoes) {
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
		return "Mouse: funciona = " + funciona + ", QtdBotoes = " + qtdBtoes + ", Tamanho = " + tamanho + "\n";
	}
	
	public Mouse(String texto) {
		
		String[] arrayAuxiliar1 = texto.split(",");
		String[] arrayAuxiliar2 = arrayAuxiliar1[0].split("=");
		this.funciona = arrayAuxiliar2[1].trim();
		
		String[] arrayAuxiliar3 = arrayAuxiliar1[1].split("=");
		this.qtdBtoes = arrayAuxiliar3[1].trim();
		
		String[] arrayAuxiliar4 = arrayAuxiliar1[2].split("=");
		this.tamanho = arrayAuxiliar4[1].trim();
		
	}
	
	
	
	
	
	
	
	
	
}
