package agenda;
import java.util.*;

public class Pessoal extends Contato {
	Scanner in = new Scanner(System.in);
	private int idade;
	private String sexo;
	private String redesocial;

	public Pessoal(String nome, String sobrenome, String telefone, String email, String endereco, int idade, String sexo, String redesocial) {
		super(nome, sobrenome, telefone, email, endereco);
		this.idade = idade;
		this.sexo = sexo;
		this.redesocial = redesocial;
	}

	@Override
	public void setContato(){

	}
	@Override
	public void getContato(){
		String nomeCompleto = nome + sobrenome;
		
		System.out.printf("Nome: %s\nTelefone: %s\nE-mail: %s\nEndereço: "
				+ "%s\nIdade: %d\nSexo: %s\nRede "
				+ "Social: %s",nomeCompleto, telefone,email,endereco,idade,sexo,redesocial);
	}
	
	public void verificaIdade() {
		idade = in.nextInt();
		while(idade<=0 || idade>110)
		{
			System.out.printf("\nIDADE INVÁLIDA! Insira novamente!");
			idade = in.nextInt();
		}
		setIdade(idade);
	}
	
	public void verificaRS(String redesocial) {
		int validaRS = redesocial.indexOf(".");
		while(validaRS == -1) {
			System.out.println("***********\nRede Social inválida, insira um site!\n***************");
			redesocial = in.nextLine();
			validaRS = redesocial.indexOf(".");
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
