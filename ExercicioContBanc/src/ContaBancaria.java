
public abstract class ContaBancaria {
	//protected faz com que s� seja visto pela classe e pelas suas subclasses// 
	protected double saldo;
	public double valor;
	
	
	
	public double Saldo() {
		return saldo;
	}	
	
	public double depositar(double valor) {
		return saldo += valor;
	}
	
	public double sacar (double valor) {
		return saldo -= valor;
		
	}
	
	public abstract double transferir (double valor, ContaBancaria conta);
	//Um m�todo abstrato obriga todas as subclasses a importar esse m�todo//
	
	
}
