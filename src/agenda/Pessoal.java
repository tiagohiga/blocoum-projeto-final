package agenda;

public class Pessoal {
	private int idade;
	private String sexo;
	private String redesocial;
	
	
	public Pessoal(int idade, String sexo,String redesocial) {
		//super();
		this.idade = idade;
		this.sexo = sexo;
		this.redesocial = redesocial;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public String getRedesocial() {
		return redesocial;
	}

	public void setRedesocial(String redesocial) {
		this.redesocial = redesocial;
	}
	
}
