package agenda;
import java.util.*;

public class Contato {
	Scanner in = new Scanner(System.in);
	
	private String nome;
	private String sobrenome;
	private String telefone;
	private String email;
	private String endereco;
	// definir tipo Date
	
	public Contato(String nome, String sobrenome, String telefone, String email, String endereco) {
		
		super();
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.telefone = telefone;
		this.email = email;
		this.endereco = endereco;
		
	}
	
	public Contato(String nome, String endereco) {
		
		super();
		this.nome = nome;
		this.endereco = endereco;
		
	}

	public void visualizarContato() {
		String nomeCompleto = this.nome + this.sobrenome;
		System.out.printf("Nome: %s\nTelefone: %s\nE-mail:"
				+ " %s\nEndereço: %s\n",nomeCompleto,telefone,email,endereco);
	}
	
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

	
	//Criar Método verificaData 
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSobrenome() {
		return sobrenome;
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
