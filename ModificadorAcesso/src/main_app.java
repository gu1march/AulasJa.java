
public class main_app {

	public static void main(String[] args) {
		

		Cliente cliente = new Cliente();
		Cliente cliente2 = new Cliente();
		
		cliente.setNome("Rafael");
		cliente.setCpf(12345678);
		cliente.setNumConta(333333);
		cliente2.setNome("Rafael");
		cliente2.setCpf(12345678);
		cliente2.setNumConta(333333);
		
		System.out.println(cliente.getNome());
		System.out.println(cliente.getCpf());
		System.out.println(cliente.getNumConta());
		
		
		System.out.println(cliente);
		System.out.println(cliente2);
	
		
		if (cliente.getNome() == cliente2.getNome()) 
			System.out.println("Os nomes são iguais");
		else
			System.out.println("Os nomes são diferentes");
		
		
		if (cliente == cliente2) 
			System.out.println("Os objetos são iguais");
		else
			System.out.println("Os objetos são diferentes");
		
		
		if (cliente.equals(cliente2))
			System.out.println("Os atributos são iguais");
		else
			System.out.println("Os atributos são diferentes");
			
		
		
	}

}
