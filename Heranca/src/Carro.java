
public class Carro extends Veiculo {
	//extends serve para dizer que esta classe é uma subclasse de uma superclasse//
	
	private boolean quatroPortas;

	@Override
	public void imprimir() {
		super.imprimir();
		System.out.println("Tem 4 Portas: " + quatroPortas);
	}

	public boolean isQuatroPortas() {
		return quatroPortas;
	}

	public void setQuatroPortas(boolean quatroPortas) {
		this.quatroPortas = quatroPortas;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
