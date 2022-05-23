
public class Veiculo {
	
	protected String marca;
	protected String modelo;
	protected int ano;
	//Protected é como a private só que os métodos das classes filhas podem usar nos seus métodos//
	
	public void buzinar() {
		System.out.println("BI BI");
	}
	
	public void imprimir () {
		System.out.println("Marca: " + marca);
		System.out.println("Modelo: " + modelo);
		System.out.println("Ano: " + ano);
	}

	public String getMarca() {
		return marca;
	}
	
	public void setMarca(String marca) {
		this.marca = marca; //O this serve para dizer que o atributo pertence a essa classe//
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}
	
	
}
