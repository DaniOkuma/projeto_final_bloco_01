package projeto_final_bloco_1.model;

public abstract class Cosmeticos {
	
	private int numero;

	private int tipo;
	private String nome;
	private float preco;

	public Object visualizar;
	
	public Cosmeticos(int numero, int tipo, String nome, float preco) {
		this.numero = numero;

		this.tipo = tipo;
		this.nome = nome;
		this.preco = preco;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	
	public int getTipo() {
		return tipo;
	}

	public void setTipo(int tipo) {
		this.tipo = tipo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public float getPreco() {
		return preco;
	}

	public void setPreco(float preco) {
		this.preco = preco;
	}
	
	public void visualizar() {

		String tipo = "";
		
		switch(this.tipo) {
		case 1:
			tipo = "Cosmético Facial";
		break;
		
		case 2:
			tipo = "Cosmético Corporal";
		break;
		}
		
		System.out.println("\n\n***********************************************************");
		System.out.println("Dados do Cosmético:");
		System.out.println("***********************************************************");
		System.out.println("Numero do Cosmético: " + this.numero);
		System.out.println("Nome do Cosmético: " + this.nome);
		System.out.println("Tipo do Cosmético: " + tipo);
		System.out.println("Preço do Cosmético: " + this.preco);
	}

}
