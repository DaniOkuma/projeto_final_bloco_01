package projeto_final_bloco_1.model;

public class Facial extends Cosmeticos {
	
	private int pele;

	public Facial(int numero, int tipo, String nome, float preco, int pele) {
		super(numero, tipo, nome, preco);
		this.pele = pele;

	}

	public int getPele() {
		return pele;
	}

	public void setPele(int pele) {
		this.pele = pele;
	}
	
    @Override
	public void visualizar() {
		super.visualizar();
		System.out.println("Tipo de pele (1 - Oleosa 2 - Seca): " + this.pele);
}
}