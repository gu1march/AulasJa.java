import java.util.Objects;

public class Cliente {
	private String nome;
	private int cpf;
	private int numConta;
	
	
	public Cliente() {//Construtor//
	}

	
	//Getters e Setters, assim se tem acesso a atributos privado através dos métodos Get e Set//
	
	//O Get serve para mostrar o valor dentro do atributo privado//
	public String getNome() {
		return nome;
	}

	//O Set serve para atribuir um valor dentro do atributo privado//
	public void setNome(String nome) {
		this.nome = nome;
	}


	public int getCpf() {
		return cpf;
	}


	public void setCpf(int cpf) {
		this.cpf = cpf;
	}


	public int getNumConta() {
		return numConta;
	}


	public void setNumConta(int numConta) {
		this.numConta = numConta;
	}


	@Override //Sobreescrevendo o toString é possível mostrar todos os atributos de um objeto sem ter que chamar os Gets um por um//
	public String toString() {
		return "****************************************\n" + "Cliente: \nNome = " + nome + " \nCPF = " + cpf + " \nNúmero da Conta = " + numConta;
	}


	@Override
	public int hashCode() {
		return Objects.hash(cpf, nome, numConta);
	}


	@Override //Equals serve para comparar os atributos dentro do objeto, assim sendo preferivel em relação ao (==)// 
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cliente other = (Cliente) obj;
		return cpf == other.cpf && Objects.equals(nome, other.nome) && numConta == other.numConta;
	}
	
	
}
