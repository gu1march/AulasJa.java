import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import javax.imageio.plugins.tiff.GeoTIFFTagSet;

public class main {

	public static void main(String[] args) throws IOException {

		List listaDeEscritos = new ArrayList();

		Mouse mouse = new Mouse("sim", "3", "pequeno");
		Mouse mouse1 = new Mouse("não", "2", "medio");
		Mouse mouse2 = new Mouse("sim", "4", "grande");

		listaDeEscritos.add(mouse);
		listaDeEscritos.add(mouse1);
		listaDeEscritos.add(mouse2);

		try (BufferedWriter escrever = new BufferedWriter(new FileWriter("Confis.txt"))) {
			for (Object mousei : listaDeEscritos) {
				escrever.write(mousei.toString() + "\n");
			}
		}
		try (BufferedReader reader = new BufferedReader(new FileReader("Confis.txt"))) {
			String line;
			String string = "";

			while ((line = reader.readLine()) != null) {
				string += line + "\n";

			}
			System.out.println(string);

		}

		System.out.println(mouse.getQtdBtoes());
		System.out.println(mouse1.getTamanho());
		System.out.println(mouse2.isFunciona());

		String teste = "Mouse: funciona = sim, qtdBotoes = 2, tamanho = pequeno\n";

		Mouse mouse7 = new Mouse(teste);

		System.out.println(mouse);

		List listaDeLidos = new ArrayList();
		listaDeLidos.add(mouse.getQtdBtoes());
		listaDeLidos.add(mouse.getTamanho());
		listaDeLidos.add(mouse.isFunciona());
		listaDeLidos.add(mouse1.getQtdBtoes());
		listaDeLidos.add(mouse1.getTamanho());
		listaDeLidos.add(mouse1.isFunciona());
		listaDeLidos.add(mouse2.getQtdBtoes());
		listaDeLidos.add(mouse2.getTamanho());
		listaDeLidos.add(mouse2.isFunciona());

		for (Object musid : listaDeLidos) {
			System.out.println(musid);
		}

	}

}
