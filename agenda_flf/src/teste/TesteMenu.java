package teste;
import java.util.Scanner;

import modelo.Contato;
import service.ContatoService;

public class TesteMenu {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado= new Scanner(System.in);
		ContatoService contatoService = new ContatoService();
		contatoService.povoaContatos();

		System.out.println("***Agenda FLF 2018***");
		
		int ops = -1;
		while (ops != 0){
			
			System.out.println("Escolha uma Opção: \n ");
			System.out.println("(1) Criar Contato");
			System.out.println("(2) Buscar Contato");
			System.out.println("(3) Alterar Contato ");
			System.out.println("(4) Deletar Contato");
			System.out.println("(5) Listar Contatos");
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
				System.out.println("Informe o nome do contato \n");
				contatoService.buscarContato(teclado.next()).mostraContato();
				break;
			case 3:
				System.out.println("Digite o nome do contato que deseja atualizar:\n");
				Contato obj = contatoService.buscarContato(teclado.next());
				System.out.println("Digite o novo nome do contato: \n");
				contatoService.configContato(obj, teclado.next());
				System.out.println("Digite o novo número do contato: \n");
				contatoService.configContato(obj, teclado.nextLong());
				obj.mostraContato();
				break;
				
			case 4:
				System.out.println("Digite o nome do contato: \n");
				contatoService.deletarContato(teclado.next());
				System.out.println("Contato deletado (y)\n");
				break;
				
			case 5:
				System.out.println("Contatos: \n");
				contatoService.listarContatos();
				break;
				//black wall
				//so loud
				//red night and i dont see any light
				//As I look from the ground, I see darkness all around................. and a can see the end of the loss less inside my mind, bye bye. i feel quite happy when I write or sing those sad things.
				
			default:
				break;
			}
		}
		System.out.println("Obrigado por Usar nosso sistema");
		System.out.println("Encerrando...");
		teclado.close();
	}

}
