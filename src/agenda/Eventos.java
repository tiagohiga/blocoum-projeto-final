package agenda;

public class Eventos extends Contato{
	private int duracao;
	private int horario;
	private String tema;
	private String descricao;
	
	//Criação do método construtor
	public Eventos(String nome, String endereco, int duracao, int horario) {
		super(nome, endereco);
	}
	
	@Override
	public void cadastrarContato() {
		//Cadastrar
	}
	
	@Override
	public void visualizarContato() {
		//Visualizar
	}
	
	//Método para formatar a data. Como receberemos um inteiro, podemos utilizar o método
	//abaixo para formatar e exibir a data em um formato específico.
	//O método pega o valor do atributo 'data' e através de algumas operações
	//atribuímos, para cada variável (ano, mês e dia) seu valor conforme a data que foi 
	//informada. Posteriormente, formatamos a data conforme padrão dd/mm/aaaa.
	/*public String formatarData() {
		int dia, mes, ano;
		ano = data % 10000;
		mes = (data / 10000) % 10;
		dia = (data / 10000) / 100;
		String dataFormatada = String.format("%02d/%02d/%d", dia, mes, ano);
		return dataFormatada;
	}*/
	
	//Getters e Setters dos atributos da classe Evento
	public int getDuracao() {
		return duracao;
	}

	public void setDuracao(int duracao) {
		this.duracao = duracao;
	}

	public int getHorario() {
		return horario;
	}

	public void setHorario(int horario) {
		this.horario = horario;
	}

	public String getTema() {
		return tema;
	}

	public void setTema(String tema) {
		this.tema = tema;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
}
