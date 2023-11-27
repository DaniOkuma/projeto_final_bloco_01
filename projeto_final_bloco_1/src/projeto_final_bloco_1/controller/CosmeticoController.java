package projeto_final_bloco_1.controller;

import java.util.ArrayList;
import java.util.Optional;

import projeto_final_bloco_1.model.Cosmeticos;
import projeto_final_bloco_1.repository.ProjetoRepository;

public class CosmeticoController implements ProjetoRepository {
	
	private ArrayList<Cosmeticos> listaCosmeticos = new ArrayList<Cosmeticos>();
	int numero = 0;

	@Override
	public void procurarPorNumero(int numero) {
		
		Optional <Cosmeticos> produto = buscarNaCollection(numero);
		
		if (produto.isPresent())
			produto.get().visualizar();
		else 
			System.out.println("O produto número " + numero + " não foi encontrado!");
		
	}

	@Override
	public void listarTodos() {
		
		for (var produto : listaCosmeticos) {
			produto.visualizar();
		}
		
	}

	@Override
	public void cadastrar(Cosmeticos produto) {
		listaCosmeticos.add(produto);
		System.out.println("O Produto número: " + produto.getNumero() + " foi cadastrado com sucesso!");
	}

	@Override
	public void atualizar(Cosmeticos produto) {
Optional <Cosmeticos> buscaProduto = buscarNaCollection(produto.getNumero());
		
		if (buscaProduto.isPresent())  {
			listaCosmeticos.set(listaCosmeticos.indexOf(buscaProduto.get()), produto);
		
				System.out.println("O Produto número " + produto.getNumero() + " foi atualizado com sucesso!");
		} else 
			System.out.println("O Produto número " + produto.getNumero() + " não foi encontrado!");
		
	}

	@Override
	public void deletar(int numero) {
		Optional <Cosmeticos> produto = buscarNaCollection(numero);
		
		if (produto.isPresent()) {
			if(listaCosmeticos.remove(produto.get()) == true)
				System.out.println("O Produto número " + numero + " foi excluído com sucesso!");
		} else 
			System.out.println("O produto número " + numero + " não foi encontrado!");
		
		

		
	}
	
	
	public int gerarNumero() {
		return ++ numero;
	}
		
	public Optional<Cosmeticos> buscarNaCollection(int numero) {
		
		for (var produto : listaCosmeticos) {
			if (produto.getNumero() == numero)
				return Optional.of(produto);
			
		}
		
		return Optional.empty();
	}
	

}

