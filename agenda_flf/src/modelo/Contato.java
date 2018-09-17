package modelo;

public class Contato {
	private String nome;
	private String tel;
	
	Contato(){
		
	}
	
	Contato(String nome, String tel){
		this.nome = nome;
		this.tel = tel;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}
	
	public void mostraContato(){
		System.out.print("Nome: "+this.nome);
		System.out.print("Telefone: "+this.tel);
		}
}
