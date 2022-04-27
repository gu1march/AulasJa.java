
public class Lampada {
	
	private String lampada;
	public int estado;
	public int metod;
	
	public void ligar() {
		this.lampada = "true";
	}
	
	public void desligar() {
			this.lampada = "false";
	}
	
	public  String imprimir() {
		if (this.lampada == "true") {
			return lampada = "Está ligada agora";
			}
		else 
			return lampada = "Está desligada agora";
	}
	
}