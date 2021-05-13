package agenda;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Menu {
	Scanner ler = new Scanner(System.in);
	
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
		int op;
		do {
			System.out.printf("\n\tInforme a opção desejada\n");
			System.out.printf("\t1. Contato Pessoal\n");
			System.out.printf("\t2. Contato Profissional\n");
			System.out.printf("\t3. Evento\n");
			System.out.printf("\t0. Sair\n");
			op = ler.nextInt();
			switch(op) {
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
			}
		} while(op != 0);
	}
	
	public void manipularContatoProfissional() {
		int op;
		do {
			System.out.printf("\n\tContato Profissional\n");
			System.out.printf("\t1. Cadastrar\n");
			System.out.printf("\t2. Exibir\n");
			System.out.printf("\t3. Alterar\n");
			System.out.printf("\t4. Excluir\n");
			System.out.printf("\t0. Voltar ao menu anterior\n");
			op = ler.nextInt();
			switch(op) {
				case 1:
					cpTemp = new ContatoProfissional(" ", " ");
					cpTemp.setContato();
					cProfissional.add(cpTemp);
					break;
				case 2:
					cpTemp = cProfissional.get(0);
					cpTemp.getContato();
					break;
				case 3:
					
					break;
				case 4:
					
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
			System.out.printf("\t3. Alterar\n");
			System.out.printf("\t4. Excluir\n");
			System.out.printf("\t0. Voltar ao menu anterior\n");
			op = ler.nextInt();
			switch(op) {
				case 1:
					pTemp = new Pessoal(" ", " ", " ", " ", " ", 0, " ", " ");
					pTemp.setContato();
					cPoessoal.add(pTemp);
					break;
				case 2:
					pTemp = cPoessoal.get(0);
					pTemp.getContato();
					break;
				case 3:
					
					break;
				case 4:
					
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
			System.out.printf("\t3. Alterar\n");
			System.out.printf("\t4. Excluir\n");
			System.out.printf("\t0. Voltar ao menu anterior\n");
			op = ler.nextInt();
			switch(op) {
				case 1:
					evTemp = new Eventos(" ", " ", 0, 0);
					evTemp.setContato();
					eventos.add(evTemp);
					break;
				case 2:
					evTemp = eventos.get(0);
					evTemp.getContato();
					break;
				case 3:
					
					break;
				case 4:
					
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
}
