package modelo;

public class Contato {
	private String nome;
	private long tel;
	
	public Contato(){
		
	}
	
	public Contato(String nome, long tel){
		this.nome = nome;
		this.tel = tel;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public long getTel() {
		return tel;
	}

	public void setTel(long tel) {
		this.tel = tel;
	}
	
	public void mostraContato(){
		System.out.println("Nome: "+this.nome + "\n");
		System.out.println("Telefone: "+ this.tel + "\n");
		}
}
