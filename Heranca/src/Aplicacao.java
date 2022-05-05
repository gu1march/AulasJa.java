
public class Aplicacao {

	public static void main(String[] args) {
		
		Veiculo veiculo = new Veiculo();
		Carro carro = new Carro();
		Caminhao caminhao = new Caminhao();
		Moto moto= new Moto();
		
		moto.setMarca("Kawasaki");
		moto.setModelo("RX");
		moto.setAno(2020);
		 
		moto.imprimir();	
		moto.buzinar();
		moto.empinar();
		
		System.out.println();
		
		caminhao.setMarca("Scania");
		caminhao.setModelo("RT");
		caminhao.setAno(2019);
		 
		caminhao.imprimir();
		caminhao.buzinar();
		
		System.out.println();
		
		carro.setMarca("Volks");
		carro.setModelo("X");
		carro.setAno(2018);
		carro.setQuatroPortas(true);
		
		carro.imprimir();
		carro.buzinar();
		
		System.out.println();
		
		veiculo.setMarca("Honda");
		veiculo.setModelo("City");
		veiculo.setAno(2013);
		
		veiculo.imprimir();
		veiculo.buzinar();
		
	}

}
