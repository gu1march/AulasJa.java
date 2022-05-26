import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class main {

	public static void main(String[] args) throws IOException {
		
		String s = "Texto para ser gravado no arquivo";
		
		//O try tenta executar uma ação que pode dar errado//
		try(BufferedWriter escrever = new BufferedWriter(new FileWriter("saida.txt"))){
			escrever.write(s);
		}
		
		List lista = new ArrayList ();
		//Lista cria uma lista//
		
		Mouse mouse = new Mouse(true,2,"Pequeno");
		Mouse mouse1 = new Mouse(false,1,"Médio");
		Mouse mouse2 = new Mouse(true,3,"Grande");
		
		lista.add(mouse);
		lista.add(mouse1);
		lista.add(mouse2);
		

		
		try(BufferedWriter escrever = new BufferedWriter(new FileWriter("saida.txt"))){
			for (Object conta : lista){
			//aqui tudo que tem na lista entra em conta//
				
			escrever.write(conta.toString());
		
		
		
		}
	                 
		}
		             
		
		
	}

}
