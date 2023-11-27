package ecommerce;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Menu {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int opcao=0;
		
		while(true) {
			
			System.out.println("                                                                                 ");
			System.out.println("BEM VINDO AO AROMA CELESTIAL: A SUA LOJA ESPECIALIZADA EM CAFÉS DE TODOS OS TIPOS");
			System.out.println("                                                                                 ");
			System.out.println("                    1 - Cadastrar café                                           ");
			System.out.println("                    2 - Listar café                                              ");
			System.out.println("                    3 - Buscar café                                              ");
			System.out.println("                    4 - Atualizar café                                           ");
			System.out.println("                    5 - Apagar café                                              ");
			System.out.println("                    6 - Comprar café                                             ");
			System.out.println("                    7 - Comprar acessórios                                       ");
			System.out.println("                    8 - Processo de fabricação do café                           ");
			System.out.println("                    9 - Conheça a nossa história                                 ");
			System.out.println("                    10 - Sair                                                     ");
			System.out.println("                                                                                 ");
			System.out.println("                    Entre com a opção desejada:                                  ");
			
			try {
				opcao = leia.nextInt();
			} catch (InputMismatchException inputMismatchException) {
				System.out.println("\nDigite uma opção válida! ");
				leia.nextLine();
				opcao = 0;
			}
			
			if (opcao == 7) {
				producao();
				keyPress();
			}
			
			if (opcao == 8) {
				sobre();
				keyPress();
			}
			
			if (opcao == 10) {
				sair();
				leia.close();
				System.exit(0);
			}
			
			switch (opcao) {
			case 1:
				System.out.println("\nCadastrar café");
				
				keyPress();
				break;
				
			case 2:
				System.out.println("\nListar café");
				
				keyPress();
				break;
				
			case 3:
				System.out.println("\nBuscar café");
				
				keyPress();
				break;
				
			case 4:
				System.out.println("\nAtualizar café");
				
				keyPress();
				break;
				
			case 5:
				System.out.println("\nApagar café");
				
				keyPress();
				break;
				
			case 6:
				System.out.println("\nComprar café");
				
				keyPress();
				break;
				
			case 7:
				System.out.println("Comprar acessórios");
				
				keyPress();
				break;
				default:
					System.out.println("\nDigite uma opção válida...");
					keyPress();
			}
		}

	}
	
	public static void sobre() {
		System.out.println("\nA Café Celestial nasceu do amor de Ana e Miguel pelo café de qualidade. "
				+ "Em 2010, abriram a loja, focada em grãos de fazendas sustentáveis. "
				+ "Com o tempo, expandiram o menu, introduzindo métodos inovadores. "
				+ "Além de ser um local de excelência no café, a loja é um ponto de encontro na comunidade, promovendo eventos culturais e música ao vivo. "
				+ "A Café Celestial é uma referência pela qualidade e compromisso com a sustentabilidade, oferecendo uma experiência única aos clientes.");
	}
	
	public static void producao() {
		System.out.println("\nA Café Celestial é dedicada à produção de café de alta qualidade. "
				+ "Grãos cuidadosamente selecionados de fazendas sustentáveis passam por um processo meticuloso, desde a colheita até a torra artesanal. "
				+ "A habilidade dos baristas em preparar o café destaca-se, proporcionando aos clientes uma experiência celestial em cada xícara.");
	}
	
	public static void sair() {
		System.out.println("\nObrigado por acessar a Aroma Celestial! :)");
	}
	
	public static void keyPress() {
		try {
			System.out.println("\nPressione Enter para continuar...");
			System.in.read();
		} catch (IOException iOException) {
			System.out.println("\nVocê pressionou uma tecla diferente de Enter...");
		}
	}

}
