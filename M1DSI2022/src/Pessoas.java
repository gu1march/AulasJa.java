
public class Pessoas {
	String nome;
	int numFigurinhas;

	void receber(int numFigurinhas) {
		this.numFigurinhas += numFigurinhas;

	}

	boolean dar(int numFigurinhas, Pessoas pessoa) {
		//boolean retorno;
	if (this.numFigurinhas < numFigurinhas) {
		System.out.println("Insuficiente figurinhas");
		//retorno = false;
		return false;
	} 
	else {
		this.numFigurinhas -= numFigurinhas;
		pessoa.receber(numFigurinhas);
		//retorno = true;
		return true;
	}
	//return retorno;	

		}

	public static void main(String[] args) {

	}

}
