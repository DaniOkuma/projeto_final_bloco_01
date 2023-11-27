package projeto_final_bloco_1.model;

public class Corporal extends Cosmeticos {

	private int ml;
	
	public Corporal(int numero, int tipo, String nome, float preco, int ml) {
		super(numero, tipo, nome, preco);
		this.ml = ml;
	}
	
	public int getML() {
		return ml;
	}
	
	public void setML(int ml) {
		this.ml = ml;
		
	}
	   @Override
		public void visualizar() {
			super.visualizar();
			System.out.println("Quantidade de ml: " + this.ml);
	   }

}
