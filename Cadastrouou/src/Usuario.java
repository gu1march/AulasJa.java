
public class Usuario extends Endere�o{
	
	private String nome;
	private int idade;
	private Endere�o endereco;
	private Sexo sexo;
	static int x;
	
	
	public String getNome() {
		return nome;
	}


	public static void incrementar() {
		x++;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}



	public int getIdade() {
		return idade;
	}



	public void setIdade(int idade) {
		this.idade = idade;
	}



	public Endere�o getEndereco() {
		return endereco;
	}



	public void setEndereco(Endere�o endereco) {
		this.endereco = endereco;
	}



	public Sexo getSexo() {
		return sexo;
	}



	public void setSexo(Sexo sexo) {
		this.sexo = sexo;
	}



	@Override
	public String toString() {
		return "Usuario: Nome = " + nome + ", Idade = " + idade + ",Sexo = " + sexo + ".";
	}


	
	
}
