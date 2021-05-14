package agenda;
import java.util.*;

public abstract class Contato {
	Scanner in = new Scanner(System.in);
	

	protected String nome;
	protected String sobrenome;
	protected String tipo;
	protected String telefone;
	protected String email;
	protected String endereco;

	
	abstract public void setContato();
	abstract public void getContato();
	

	//buscarContato
	//excluirContato
	//definir tipo Date
	
	
	
	public Contato(String nome, String telefone) {
		
		super();
		
	}
	
	public Contato(String nome, String endereco, String email, String telefone, String tipo) {
		
		super();
		this.nome = nome;
		this.endereco = endereco;
		
	}

	/*public void visualizarContato() {
		String nomeCompleto = this.nome + this.sobrenome;
		System.out.printf("Nome: %s\nTelefone: %s\nE-mail:"
				+ " %s\nEndereï¿½o: %s\n",nomeCompleto,telefone,email,endereco);
	}*/
	
	public void verificaEmail(String email) {
		int validaEmail = email.indexOf("@");
		while(validaEmail == -1) {
			System.out.println("***********\nE-mail inválido, verifique se possui o @\n***************");
			email = in.nextLine();
			validaEmail = email.indexOf("@");
		}
		setEmail(email);
	}
	
	public void verificaTelefone(String telefone) {
		while(telefone.length() != 12) {
			System.out.println("**********\nTelefone Inválido, digite novamente!!!!\n************");
			telefone = in.nextLine();
		}
		setTelefone(telefone);
	}

	public void verificaString(String nome) {
		while(nome.isEmpty()) {
			System.out.println("Este campo está vazio, por favro digite algo!!!!");
			nome = in.nextLine();
		}
		setNome(nome);
	}
	
	//Criar Metodo verificaData 
	
	public String getNome() {
		return nome;
	}

	
	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public String getNomeCompleto() {
		return  nome + " " + sobrenome;
	}
	
	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	
	
}