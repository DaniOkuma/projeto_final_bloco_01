package projeto_final_bloco_1;

import java.util.Scanner;
import projeto_final_bloco_1.model.Cosmeticos;
import projeto_final_bloco_1.model.Facial;
import projeto_final_bloco_1.model.Corporal;

public class Menu {

	public static void main(String[] args) {
		        
		        Scanner leia = new Scanner(System.in);
		        
		     // CosmeticoController cosmeticos = new CosmeticoController();
		        
			int  opcao, numero, tipo;
				String  nome;
			float preco;
				
				// teste
				
				
				
			Facial fac = new Facial (1, 1, "Creme hidratante facial", 10.50f, "Oleosa");
			fac.visualizar();
			
			//produto.cadastrar(fac);
					
		   Corporal corp = new Corporal(2, 2, "Creme hidratante corporal", 40.00f, 400);
		    corp.visualizar();
					//produto.cadastrar(corp);
					
				
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
					
					opcao = leia.nextInt();

					if (opcao == 6) {
						System.out.println("\nLoja de Cosméticos - Venha aprimorar sua beleza!");
						sobre();
		                 leia.close();
						System.exit(0);
					}

					switch (opcao) {
						case 1:

							System.out.println("Listar todas os Produtos\n\n");

							break;
						case 2:
							System.out.println("Buscar Produtos por número\n\n");

							break;
						case 3:
							System.out.println("Cadastrar Produto\n");
							
							break;
						case 4:
							System.out.println("Atualizar número do Produto\n");

							break;
						case 5:
							System.out.println("Apagar Produto\n\n");

							break;
					
						default:
							System.out.println("\nOpção Inválida!\n");
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
		}
