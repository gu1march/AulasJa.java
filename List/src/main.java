import java.util.ArrayList;
import java.util.List;

public class main {

	public static void main(String[] args) {
		
		//lista adiciona automaticamente espaços e os remove também//
		List lista = new ArrayList();
		
		lista.add("abc");
		lista.add(12);
		lista.add(true);
//		for (int x = 0; x < lista.size();x++) {
//			System.out.println(lista.get(x));
//		}
	
		//Forma mais facíl de usar o for em uma lista//
		for (Object valor : lista) {
			System.out.println(valor);
		}
		
		System.out.println();
		
		//remove um espaço determinado da lista//
		lista.remove(0);
		for (Object valor : lista) {
			System.out.println(valor);
		}
		
		System.out.println();
		
		//o add adiciona um valor na lista, e caso a posição ja tenha um valor ele realoca tudo abaixo dele para baixo//
		lista.add(0, "def");
		for (Object valor : lista) {
			System.out.println(valor);
		}
		
		System.out.println();
		
		//substitui o valor da posição escolhida//
		lista.set(0, "ghi");
		for (Object valor : lista) {
			System.out.println(valor);
		}
		System.out.println();
		
		//clear apaga/limpa toda a lista//
		lista.clear();
		if (lista.isEmpty()) {
			System.out.println("Sua lista está vazia");
		}
		
		
		Conta conta1 = new Conta("Agua", 60.00);
		Conta conta2 = new Conta("Luz", 120.00);
		
		List<Conta> ListaDeContas = new ArrayList<Conta>();
		
		ListaDeContas.add(conta1);
		ListaDeContas.add(conta2);
		
		for (Conta conta : ListaDeContas) {
			System.out.println(conta);
		}
		
		
	}

}
