import java.util.Scanner;

public class Main_ex {

	public static void main(String[] args) {
		
		Lampada lampada1 = new Lampada();
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Se lampada estiver Ligada digite 1 e caso esteja Desligada 0: ");
		lampada1.estado = leitor.nextInt();
		
		if (lampada1.estado == 1)
			System.out.println("Lampada est� ligada");
		else if (lampada1.estado == 0)
			System.out.println("Lampada est� desligada");
		else
			System.out.println("Valor inserido n�o valido");
		
		System.out.println("Agora caso queira desligar a lampada digite 1 e 0 para ligar: ");
		lampada1.metod = leitor.nextInt();
		
		if ((lampada1.estado == 0) && (lampada1.metod == 0)) {
			lampada1.ligar();
			System.out.println(lampada1.imprimir());
	}
		else if ((lampada1.estado == 1) && (lampada1.metod == 1)) {
			lampada1.desligar();
			System.out.println(lampada1.imprimir());
	}
		else 
			System.out.println("Est� a��o n�o � poss�vel");
	}

}
