
public class Usuario extends Endereço{
	
	private String nome;
	private int idade;
	private Endereço endereco;
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



	public Endereço getEndereco() {
		return endereco;
	}



	public void setEndereco(Endereço endereco) {
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
