import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class main {

	public static void main(String[] args) throws IOException {
		
		String s = "Testo para ser gravado no arquivo";
		
		try(BufferedWriter escrever = new BufferedWriter(new FileWriter("saida.txt"))){
			escrever.write(s);
		}
		
		
		
		
		
		
	}

}
