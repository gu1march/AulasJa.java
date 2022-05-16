
public abstract class ContaBancaria {
	//protected faz com que só seja visto pela classe e pelas suas subclasses// 
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
	//Um método abstrato obriga todas as subclasses a importar esse método//
	
	
}
