package teste;
import java.util.Scanner;

import service.ContatoService;

public class TesteMenu {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado= new Scanner(System.in);
		ContatoService contatoService = new ContatoService();

		System.out.println("***Agenda FLF 2018***");
		
		int ops = -1;
		while (ops != 0){
			
			System.out.println("Escolha uma Opção: \n ");
			System.out.println("(1) Criar Contato \n ");
			System.out.println("(2) Buscar Contato \n ");
			System.out.println("(3) Alterar Contato \n ");
			System.out.println("(4) Deletar Contato \n ");
			System.out.println("(5) Listar Contatos \n ");
			System.out.println("(0) Sair \n ");
			ops = teclado.nextInt();
			
			
			switch (ops) {
			case 1:	
				System.out.println("Digite o Nome do Contato \n");
				String nome = teclado.next();
				System.out.println("Digite o Telefone \n");
				long tel = teclado.nextLong();
				contatoService.addContato(nome, tel);
				break;
			case 2:
				System.out.println("");

			default:
				break;
			}
		}
		System.out.println("Obrigado por Usar nosso sistema");
		System.out.println("Encerrando...");
		teclado.close();
	}

}
