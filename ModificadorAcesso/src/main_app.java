
public class main_app {

	public static void main(String[] args) {
		
		ContaBancaria conta1 = new ContaBancaria(true, 3.0);
		ContaBancaria conta2 = new ContaBancaria();
		
		
//		conta1.ativo = true;
//		conta1.numConta = 1234;
//		conta1.saldo = 100.50;
//		
//		System.out.println(conta1.ativo);
//		System.out.println(conta1.numConta);
//		System.out.println(conta1.saldo);
		
		
//		conta1.receber(100.8);
//		conta1.dar(50.8);
		System.out.println(conta1.saldo());
		System.out.println(conta2.saldo());
		
		
	}

}
