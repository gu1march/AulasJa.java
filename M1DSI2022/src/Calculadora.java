import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
	double n2 = 2;
	double resulS;
	double resulSU;
	double resulM;
	double resulD;
	
	Scanner leitor = new Scanner(System.in); 
	
	System.out.println("Insira valor 1: ");
	double n1 = nextLine();

	resulS = n1 + n2;
	System.out.println("O resultado da soma é: " + resulS);
	
	resulSU = n1 - n2;
	System.out.println("O resultado da subtração é: " + resulSU);
	
	resulM = n1 * n2;
	System.out.println("O resultado da multiplicação é: " + resulM);
				
	resulD = n1 / n2;
	System.out.println("O resultado da divisão é: " + resulD);
	} 

}
