package teste;

import modelo.Contato;

public class Programa {

	public static void main(String[] args) {
		System.out.println("Agenda de Contatos 2018 /n");

		Contato c1 = new Contato("Magnum","96293064");	
		Contato c2 = new Contato("Amanda","98822231");
		Contato c3 = new Contato("Maria", "987654321");
		
		Contato[] listaContatos = new Contato[3];
		listaContatos[0]=c1;
		listaContatos[1]=c2;
		listaContatos[2]=c3;

		for (Contato contato : listaContatos){
			contato.mostraContato();

		}
	}
}
