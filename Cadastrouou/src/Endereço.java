
public class Endere�o {

	private String rua;
	private int num;
	private String bairro;
	
	public String getRua() {
		return rua;
	}
	public void setRua(String rua) {
		this.rua = rua;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public String getBairro() {
		return bairro;
	}
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	
	
	public String tog() {
		return "Endere�o: Rua = " + getRua() + ", N� = " + getNum() + ", Bairro = " + getBairro() + ".";
	}

	
	
	
}
