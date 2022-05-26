import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class main {

	public static void main(String[] args) throws IOException {

		String x;

		Scanner leitor = new Scanner(System.in);

		System.out.println("Escreva uma mensagem");
		x = leitor.next();

		try (BufferedWriter escrever = new BufferedWriter(new FileWriter("abetismo.txt"))) {
			escrever.write(x);
		}

		try (BufferedReader reader = new BufferedReader(new FileReader("abetismo.txt"))) {
			String line;
			String string = "";

			while ((line = reader.readLine()) != null) {
				string += line + "\n";
				
			}
			System.out.println(string);
		}
	}
}
