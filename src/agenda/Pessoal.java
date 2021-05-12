package agenda;

public class Pessoal extends Contato{
	private int idade;
	private String sexo;
	private String redesocial;

	public Pessoal(String nome, String sobrenome, String telefone, String email, String endereco, int idade, String sexo, String redesocial) {
		super(nome, sobrenome, telefone, email, endereco);
		this.idade = idade;
		this.sexo = sexo;
		this.redesocial = redesocial;
	}

	public void cadastroPessoal(){

	}

	public void visualizaPessoal(String nome, String sobrenome, String telefone, String email, String endereco, int idade, String sexo, String redesocial){
		System.out.printf("Nome: %s %s\nTelefone: %s\nE-mail: %s\nEndereço: %s\nIdade: %d\nSexo: %s\nRede Social: %s",nome,sobrenome,telefone,email,endereco,idade,sexo,redesocial);
	}
	
	public void verificaIdade() {
		idade = in.nextLine();
		while(idade<0 || idade>110)
		{
			System.out.printf("\IDADE INVÁLIDA! Insira novamente!");
			idade = in.nextLine();
		}
		setIdade();
	}
	
	public void verificaRS(String redesocial) {
		int validaRS = redesocial.indexOf(".");
		while(validaRS == -1) {
			System.out.println("***********\nRede Social inválida, insira um site!\n***************");
			redesocial = in.nextLine();
			redesocial = redesocial.indexOf(".");
		}
		setRedesocial(redesocial);
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
