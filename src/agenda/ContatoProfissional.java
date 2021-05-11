package agenda;

import java.text.NumberFormat;

public class ContatoProfissional extends Contato {
	private String cargo;
	private double salario;
	private String setor;
	private String nomeEmpresa;
	
	public ContatoProfissional(String nome, String sobrenome, String telefone, String email, String endereco, String cargo, double salario, String setor, String nomeEmpresa ) {
		super(nome, sobrenome, telefone, email, endereco);
		this.cargo = cargo;
		this.salario = salario;
		this.setor = setor;
		this.nomeEmpresa = nomeEmpresa;
	}
	
	public void visualizarContatoProfissional() {
		System.out.printf("Cargo: %s\n Setor: %s\nNome Empresa: %s\n", cargo, setor, nomeEmpresa);
	}
	
	public String formataSalario() {
		NumberFormat nf = NumberFormat.getCurrencyInstance();
		nf.setMinimumFractionDigits(2);
		String formatoSalario = nf.format(salario);
		return formatoSalario;
	}
	
	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
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
