import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		
		
		List lista = new ArrayList ();
		Scanner leitor = new Scanner(System.in);
		Usuario usuario = new Usuario();
		Usuario usuario1 = new Usuario();
		Usuario usuario2 = new Usuario();
		Usuario usuario3 = new Usuario();
		
		int sexo;
		int idade;
		String rua;
		String nome;
		int num;
		String bairro;
		int x;
		
		
		System.out.println("Insira nome: ");
		nome = leitor.next();
		
		System.out.println("Insira idade: ");
		idade = leitor.nextInt();
		System.out.println("Insira sexo (1-Masculino) e (0-Feminino): ");
		sexo = leitor.nextInt();
		if (sexo == 1)
			usuario.setSexo(Sexo.MASULINO);
		else
			usuario.setSexo(Sexo.FEMININO);		
		System.out.println("Insira bairro: ");
		bairro = leitor.next();
		System.out.println("Insira rua: ");
		rua = leitor.next();
		System.out.println("Insira num: ");
		num = leitor.nextInt();
		
		
		usuario.setNome(nome);
		usuario.setIdade(idade);
		usuario.setRua(rua);
		usuario.setBairro(bairro);
		usuario.setNum(num);
		usuario1.setNome(nome);
		usuario1.setIdade(idade);
		usuario1.setRua(rua);
		usuario1.setBairro(bairro);
		usuario1.setNum(num);
		usuario2.setNome(nome);
		usuario2.setIdade(idade);
		usuario2.setRua(rua);
		usuario2.setBairro(bairro);
		usuario2.setNum(num);
		usuario3.setNome(nome);
		usuario3.setIdade(idade);
		usuario3.setRua(rua);
		usuario3.setBairro(bairro);
		usuario3.setNum(num);
		
		
		System.out.println();
		lista.add( usuario.toString());
		lista.add( usuario.tog());
		lista.add( usuario1.toString());
		lista.add( usuario1.tog());
		lista.add( usuario2.toString());
		lista.add( usuario2.tog());
		lista.add( usuario3.toString());
		lista.add( usuario3.tog());
		
		
		for (Object valor : lista) {
			System.out.println(valor);
		}
		
		
		
		
	}

}
