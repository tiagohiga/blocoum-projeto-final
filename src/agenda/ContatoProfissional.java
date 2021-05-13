package agenda;

import java.text.NumberFormat;

public class ContatoProfissional extends Contato {
	

	private String cargo;
	private double salario;
	private String setor;
	private String nomeEmpresa;
	

	public ContatoProfissional(String nome, String telefone) {
		super(nome, telefone);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void getContato() {
		String nomeCompleto = nome + sobrenome;
		System.out.printf("Nome: %s\nTelefone: %s\nE-mail:" + " %s\nEndereço: %s\nCargo: "
				+ "%s\nSalário: %f\nSetor: %s\nNome Empresa: "
				+ " %s",nomeCompleto,telefone,email,endereco,cargo,salario,setor,nomeEmpresa);
	}
	
	@Override 
	public void setContato() {
		
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
