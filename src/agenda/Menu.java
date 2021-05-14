package agenda;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Menu {
	Scanner ler = new Scanner(System.in);
	Scanner in = new Scanner(System.in);
	List<Eventos> eventos = new ArrayList<Eventos>();
	List<Pessoal> cPoessoal = new ArrayList<Pessoal>();
	List<ContatoProfissional> cProfissional = new ArrayList<ContatoProfissional>();
	
	Eventos evTemp;
	Pessoal pTemp;
	ContatoProfissional cpTemp;
	
	//Contato cTemp = null;
	
	public Menu(){
		escolherEntrada();
	}
	
	public void escolherEntrada() {
		int opcao;
		do {
			System.out.printf("\n\tInforme a opção desejada\n");
			System.out.printf("\t1. Contato Pessoal\n");
			System.out.printf("\t2. Contato Profissional\n");
			System.out.printf("\t3. Evento\n");
			System.out.printf("\t0. Sair\n");
			opcao = in.nextInt();
			switch(opcao) {
				case 1:
					manipularContatoPessoal();
					break;
				case 2:
					manipularContatoProfissional();
					break;
				case 3:
					manipularEventos();
					break;
				default:
					System.out.printf("\nFinalizando...");
					System.exit(0);
			}
		} while(opcao != 0);
	}
	
	public void manipularContatoProfissional() {
		int op;
		do {
			System.out.printf("\n\tContato Profissional\n");
			System.out.printf("\t1. Cadastrar\n");
			System.out.printf("\t2. Exibir\n");
			System.out.printf("\t3. Pesquisar Contato\n");
			System.out.printf("\t4. Excluir\n");
			System.out.printf("\t0. Voltar ao menu anterior\n");
			op = ler.nextInt();
			switch(op) {
				case 1:
					ler.nextLine();
					cpTemp = new ContatoProfissional(" ", " ");
					cpTemp.setContato();
					cProfissional.add(cpTemp);
					break;
				case 2:
					ler.nextLine();
					for(int i = 0; i < cProfissional.size(); i++) {
						cpTemp = cProfissional.get(i);
						cpTemp.getContato();
						System.out.println();
					}
					break;
				case 3:
					ler.nextLine();
					System.out.print("Digite um nome para pesquisa: ");
					String n = ler.nextLine();
					for(int i = 0; i < cProfissional.size(); i++) {
						if(cProfissional.get(i).getNomeCompleto().equals(n)) {
							cpTemp = cProfissional.get(i);
							cpTemp.getContato();
							System.out.println();
							manipularContatoProfissional();
						}
					}
					System.out.println("Contato não encontrado!");
					manipularContatoProfissional();
					break;
				case 4:
					ler.nextLine();
					System.out.print("Digite um nome para remover da lista de contatos: ");
					String n1 = ler.nextLine();
					for(int i = 0; i < cProfissional.size(); i++) {
						if(cProfissional.get(i).getNomeCompleto().equals(n1)) {
							cProfissional.remove(i);
							System.out.println("Contato removido com sucesso!!!");
							manipularContatoProfissional();
						}
					}
					System.out.println("Contato não encontrado!");
					manipularContatoProfissional();
					break;
				case 0:
					escolherEntrada();
					break;
				default:
					System.out.printf("\nFinalizando...");
			}
		} while(op != 0);
		escolherEntrada();
	}
	
	public void manipularContatoPessoal() {
		int op;
		do {
			System.out.printf("\n\tContato Pessoal\n");
			System.out.printf("\t1. Cadastrar\n");
			System.out.printf("\t2. Exibir\n");
			System.out.printf("\t3. Pesquisar Contato\n");
			System.out.printf("\t4. Excluir\n");
			System.out.printf("\t0. Voltar ao menu anterior\n");
			op = ler.nextInt();
			switch(op) {
				case 1:
					ler.nextLine();
					pTemp = new Pessoal(" ", " ", " ", " ", " ", 0, " ", " ");
					pTemp.setContato();
					cPoessoal.add(pTemp);
					break;
				case 2:
					ler.nextLine();
					for(int i = 0; i < cPoessoal.size(); i++) {
						pTemp = cPoessoal.get(i);
						pTemp.getContato();
						System.out.println();
					}	
					break;
				case 3:
					ler.nextLine();
					System.out.print("Digite um nome para pesquisa: ");
					String n = ler.nextLine();
					for(int i = 0; i < cPoessoal.size(); i++) {
						if(cPoessoal.get(i).getNomeCompleto().equals(n)) {
							pTemp = cPoessoal.get(i);
							pTemp.getContato();
							System.out.println();
							manipularContatoPessoal();
						}
					}
					System.out.println("Contato não encontrado!");
					manipularContatoPessoal();
					break;
				case 4:
					ler.nextLine();
					System.out.print("Digite um nome para pesquisa: ");
					String n1 = ler.nextLine();
					for(int i = 0; i < cPoessoal.size(); i++) {
						if(cPoessoal.get(i).getNomeCompleto().equals(n1)) {
							cPoessoal.remove(i);
							System.out.println("Contato removido com sucesso!");
							manipularContatoPessoal();
						}
					}
					System.out.println("Contato não encontrado!");
					manipularContatoPessoal();
					break;
				case 0:
					escolherEntrada();
					break;
				default:
					System.out.printf("\nFinalizando...");
			}
		} while(op != 0);
		escolherEntrada();
	}
	
	public void manipularEventos() {
		int op;
		do {
			System.out.printf("\n\tEventos\n");
			System.out.printf("\t1. Cadastrar\n");
			System.out.printf("\t2. Exibir\n");
			System.out.printf("\t3. Pesquisar Evento\n");
			System.out.printf("\t4. Excluir\n");
			System.out.printf("\t0. Voltar ao menu anterior\n");
			op = ler.nextInt();
			switch(op) {
				case 1:
					ler.nextLine();
					evTemp = new Eventos(" ", " ", 0, 0);
					evTemp.setContato();
					eventos.add(evTemp);
					break;
				case 2:
					ler.nextLine();
					for(int i = 0; i < eventos.size(); i++) {
						evTemp = eventos.get(i);
						evTemp.getContato();
						System.out.println();
					}
					break;
				case 3:
					ler.nextLine();
					System.out.print("Digite um nome para pesquisar no evento: ");
					String n = ler.nextLine();
					for(int i = 0; i < eventos.size(); i++) {
						if(eventos.get(i).getNome().equals(n)) {
							evTemp = eventos.get(i);
							evTemp.getContato();
							System.out.println();
							manipularEventos();
						}
					}
					System.out.println("Evento não encontrado!!!");
					manipularEventos();
					break;
					
				case 4:
					ler.nextLine();
					System.out.print("Digite um nome para pesquisar no evento: ");
					String n1 = ler.nextLine();
					for(int i = 0; i < eventos.size(); i++) {
						if(eventos.get(i).getNome().equals(n1)) {
							eventos.remove(i);
							System.out.println("Evento removido com sucesso!!");
							manipularEventos();
						}
					}
					System.out.println("Evento não encontrado!!!");
					manipularEventos();
					break;
				case 0:
					escolherEntrada();
					break;
				default:
					System.out.printf("\nFinalizando...");
					op = 1;
			}
		} while(op != 0);
		
		escolherEntrada();
	}
	
}
