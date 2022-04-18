
public class main_Aplication {

	public static void main(String[] args) {

		Pessoas pessoa1 = new Pessoas();
		Pessoas pessoa2 = new Pessoas();
		Pessoas pessoa3 = new Pessoas();

		pessoa1.nome = "Guilherme";
		pessoa1.numFigurinhas = 1;
		pessoa2.nome = "Gustavo";
		pessoa2.numFigurinhas = 2;
		pessoa3.nome = "Jonas";
		pessoa3.numFigurinhas = 9;

		pessoa1.receber(3);
		pessoa2.receber(6);
		boolean retorno = pessoa3.dar(12, pessoa2);

		if (retorno == true) {
			System.out.println("Depois");

			System.out.println(pessoa1.nome);
			System.out.println(pessoa1.numFigurinhas);
			System.out.println(pessoa2.nome);
			System.out.println(pessoa2.numFigurinhas);
			System.out.println(pessoa3.nome);
			System.out.println(pessoa3.numFigurinhas);

		}
	}
}
