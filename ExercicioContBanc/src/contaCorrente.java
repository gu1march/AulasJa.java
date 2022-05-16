
public class contaCorrente extends ContaBancaria{

	@Override
	public double transferir(double valor, ContaBancaria conta) {
		return saldo - (saldo * 0.1);
		
	}

}
