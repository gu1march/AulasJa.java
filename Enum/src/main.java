
public class main {
	
	public static final double PI = 3.14; 
	
	private enum Sexo {
		MASCULINO, FEMININO;
	}
	
	public static void main(String[] args) {
		
		double pi = main.PI;
		
		DiaDaSemana hoje = DiaDaSemana.SEGUNDA;
		int num = DiaDaSemana.SEGUNDA.getNum();
		 
		System.out.println(num);
		
		String s = "TERCA";
		hoje = DiaDaSemana.valueOf(s);
		
		System.out.println(hoje.getNum());
		
		Sexo sexo = Sexo.FEMININO;
		sexo = Sexo.MASCULINO;
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
