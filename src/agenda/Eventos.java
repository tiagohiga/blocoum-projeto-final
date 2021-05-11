package agenda;

public class Eventos {
	private int duracao;
	private int horario;
	private String tema;
	private String descricao;
	
	//Criação do método construtor
	public Eventos(int duracao, int horario, String tema, String descricao) {
		
		//Chamada dos atributos exclusivos da classe Evento
		this.duracao = duracao;
		this.horario = horario;
		this.tema = tema;
		this.descricao = descricao;
	}
	
	//Método para realizarmos o cadastro de um novo evento na agenda - Aguardando aula de Polimorfismo
	public void cadastrarEvento() {
		
	}
	
	//Método para exibição do evento cadastrado - Aguardando aula de Polimorfismo
	public void exibirEvento(String nomeEvento) {
		
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
	
	//Getters e Setters do atributos da classe Evento
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
