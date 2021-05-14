package agenda;

import java.text.NumberFormat;

public class ContatoProfissional extends Contato {
	

	private String cargo;
	//private double salario;
	private String setor;
	private String nomeEmpresa;
	

	public ContatoProfissional(String nome, String telefone) {
		super(nome, telefone);
		// TODO Auto-generated constructor stub
	}
	
	
	@Override
	public void getContato() {
		String nomeCompleto = nome + " " + sobrenome;
		System.out.printf("Nome: %s\nTelefone: %s\nE-mail:" + " %s\nEndereço: %s\nCargo: "
				+ "%s\nSetor: %s\nNome Empresa: "
				+ " %s",nomeCompleto,telefone,email,endereco,cargo, setor,nomeEmpresa);
	}
	
	@Override 
	public void setContato() {
		System.out.println("Informe os dados que deseja cadastrar:");
		System.out.println("Qual o nome do contato?");
		verificaString(in.nextLine());
		System.out.println("Qual o sobrenome do contato?");
		setSobrenome(in.nextLine());
		System.out.println("Qual o telefone do contato?");
		verificaTelefone(in.nextLine());
		System.out.println("Qual o e-mail do contato?");
		verificaEmail(in.nextLine());
		System.out.println("Informe o endereço do contato: ");
		setEndereco(in.nextLine());
		System.out.println("Informe o cargo do contato: ");
		this.setCargo(in.nextLine());
		System.out.println("Informe o setor do contato: ");
		setSetor(in.nextLine());
		System.out.println("Informe o nome da Empresa: ");
		setNomeEmpresa(in.nextLine());
	}
	
	/*public String formataSalario() {
		NumberFormat nf = NumberFormat.getCurrencyInstance();
		nf.setMinimumFractionDigits(2);
		String formatoSalario = nf.format(salario);
		return formatoSalario;
	}*/
	
	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public String getSetor() {
		return setor;
	}

	public void setSetor(String setor) {
		this.setor = setor;
	}

	public String getNomeEmpresa() {
		return nomeEmpresa;
	}

	public void setNomeEmpresa(String nomeEmpresa) {
		this.nomeEmpresa = nomeEmpresa;
	}
	
}