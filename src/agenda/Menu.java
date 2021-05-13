package agenda;

import java.util.Scanner;
public class Menu {
	Scanner leia = new Scanner(System.in);
	Contato contato = null;
	public Menu() {
		int indice = getIndice();
		
		ContatoProfissional[] profissional = new ContatoProfissional[indice];
		Pessoal[] pessoal = new Pessoal[indice];
		Eventos[] eventos = new Eventos[indice];
		
		informarMenu(pessoal, profissional, eventos);
	}
	
	private void informarMenu(Pessoal[] pessoal, ContatoProfissional[] profissional, Eventos[] eventos) {
		int opcao = 0;
		System.out.printf("Menu");
	}
	
	private int getIndice() {
		int ind;
		do {
			System.out.printf("Informe o número de contatos da agenda: ");
			ind = leia.nextInt();
		} while(ind < 1 || ind > 50);
		
		return ind;
	}
}
