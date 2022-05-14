
public class Preparador {
	
	public void prepararBebida(Bebida bebida) {
		System.out.println("Preparando a bebida " + bebida.getNome());
		System.out.println("Colocando " + bebida.getNome() + " no copo");
		
		
		bebida.preparar();
		
		if(bebida.isAquecer()) {
			System.out.println("Aquecendo a bebida " + bebida.getNome());
		}
		System.out.println("Bebida preparada com sucesso!! \n");
	}
	
	
	
}
