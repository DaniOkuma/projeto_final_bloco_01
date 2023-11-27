package projeto_final_bloco_1.repository;
import projeto_final_bloco_1.model.Cosmeticos;

public interface ProjetoRepository {
	
	//CRUD
	public void procurarPorNumero(int numero);
	public void listarTodos();
	public void cadastrar (Cosmeticos produto);
	public void atualizar (Cosmeticos produto);
	public void deletar (int numero);
	
	
}
