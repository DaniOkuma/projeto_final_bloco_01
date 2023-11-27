package projeto_final_bloco_1;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Optional;
import java.util.Scanner;
import projeto_final_bloco_1.model.Cosmeticos;
import projeto_final_bloco_1.model.Facial;
import projeto_final_bloco_1.controller.CosmeticoController;
import projeto_final_bloco_1.model.Corporal;

public class Menu {

	public static void main(String[] args) {
		        
		    Scanner leia = new Scanner(System.in);
		        
		    CosmeticoController produtos = new CosmeticoController();
		        
			int  opcao, numero, tipo, ml, pele;
			String  nome;
			float preco;
				
		   /* teste
				
			Facial fac = new Facial (1, 1, "Creme hidratante facial", 10.50f, 1);
			produtos.cadastrar(fac);
					
		   Corporal corp = new Corporal(2, 2, "Creme hidratante corporal", 40.00f, 400);
		   produtos.cadastrar(corp);
					*/
				
				while(true) {

					System.out.println("*****************************************************");
					System.out.println("                                                     ");
					System.out.println("                 LOJA DE COSMÉTICOS                  ");
					System.out.println("                                                     ");
					System.out.println("*****************************************************");
					System.out.println("                                                     ");
					System.out.println("            1 - Listar Produtos                      ");
					System.out.println("            2 - Buscar por Produto                   ");
					System.out.println("            3 - Cadastrar Produto                    ");
					System.out.println("            4 - Atualizar Produto                    ");
					System.out.println("            5 - Apagar Produto                       ");
					System.out.println("            6 - Sair                                 ");
					System.out.println("                                                     ");
					System.out.println("*****************************************************");
					System.out.println("Entre com a opção desejada:                          ");
					System.out.println("                                                     ");
					
					try {
						opcao = leia.nextInt();
						} catch(InputMismatchException e) {
							System.out.println("Digite números inteiros!");
							leia.nextLine();
							opcao = 0;
						}
						
						if (opcao == 6) {
							System.out.println("\nLoja de Cosméticos - Venha aprimorar sua beleza!");
							sobre();
							leia.close();
							System.exit(0);
						
					}

					switch (opcao) {
						case 1:

							System.out.println("Listar todos os Produtos\n\n");
							produtos.listarTodos();
							
							keyPress();
							break;
							
						case 2:
							System.out.println("Buscar Produtos por número\n\n");
					
							System.out.println("Digite o número do Produto: ");
							numero = leia.nextInt();
							
							produtos.procurarPorNumero(numero);
							keyPress();
							break;
							
						case 3:
							System.out.println("Cadastrar Produto\n");
				
							
							System.out.println("Digite o nome do Produto: ");
							leia.skip("\\R");
							nome = leia.nextLine();
						
							System.out.println("Digite o tipo do Produto (1 - Facial ou 2 - Corporal): ");
							tipo = leia.nextInt();
						
							System.out.println("Digite o preço do Produto: ");
							preco = leia.nextFloat();
							
							switch(tipo) {
							case 1 -> {
								System.out.println("Digite para que tipo de pele é o produto (1- Oleosa 2 -Seca): ");
							
								pele = leia.nextInt();
								produtos.cadastrar(new Facial(produtos.gerarNumero(), tipo, nome, preco, pele));
								
							}
							
							case 2 -> {
								
								
								System.out.println("Digite a quantidade de ml do Produto: ");
							    ml= leia.nextInt();
								produtos.cadastrar(new Corporal(produtos.gerarNumero(), tipo, nome, preco, ml));
								
							}
							}
							
							keyPress();
							break;
							
						case 4:
							System.out.println("Atualizar Produto\n");
							
							System.out.println("Digite o número do Produto: ");
							
							numero = leia.nextInt();
							
							Optional<Cosmeticos> produto = produtos.buscarNaCollection(numero);
							
							if(produto.isPresent()) {
								
						    	preco = produto.get().getPreco();
							
							System.out.println("Digite o nome do Produto: ");
							leia.skip("\\R");
							nome = leia.nextLine();
								
								
							tipo = produto.get().getTipo();
								
							switch(tipo) {
							
							case 1 -> {
								System.out.println("Digite o tipo de pele (1 - Oleosa 2 - Seca) : ");
								pele = leia.nextInt();
								
								System.out.println("Digite o preço do produto: ");
								preco = leia.nextFloat();
								produtos.atualizar(new Facial(numero, tipo, nome, preco, pele));
							
						}
						
							case 2 -> {
								System.out.println("Digite a quantidade de ml do Produto: ");
								ml = leia.nextInt();
								
								System.out.println("Digite o preço do produto: ");
								preco = leia.nextFloat();
								produtos.atualizar(new Corporal(numero, tipo, nome, preco, ml));
							
							
						}
						}	
								
							}else 
								System.out.println("O Produto número " + numero + " não foi encontrado!");
							
							keyPress();
							
		                    		break;
						case 5:
							
							System.out.println("Apagar Produto\n\n");
							
							System.out.println("Digite o número do Produto: ");
							numero = leia.nextInt();
							
							produtos.deletar(numero);
							keyPress();
						
							
									break;
					
						default:
							System.out.println("\nOpção Inválida!\n");
							
							keyPress();
							break;
					}
				}
			}
		    
			public static void sobre() {
				System.out.println("\n*********************************************************");
				System.out.println("Projeto Desenvolvido por: ");
				System.out.println("Danielle Okuma");
				System.out.println("github.com/DaniOkuma");
				System.out.println("*********************************************************");
			}
			
			  public static void keyPress() {
			    	
			    	try {
			    		
			    		System.out.println("Pressione a tecla ENTER para continuar...");
			    		System.in.read();
			    		
			    	} catch (IOException e) {
			    		System.out.println("Você pressionou uma tecla inválida!");
			    	}
		}
}
