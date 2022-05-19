import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		
		
		
		Scanner leitor = new Scanner(System.in);
		
		Usuario usuario1 = new Usuario();
		Usuario usuario2 = new Usuario();
		
		
		
		System.out.println("Digite nome");
		usuario1.nome =  leitor.next();
		leitor++;
		
		System.out.println("Digite nome");
		usuario2.nome =  leitor.next();
		
		
		
	}

}
