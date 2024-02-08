package modulo09;

import java.util.Scanner;

public class testeLacoSwitch {
	
	public static void main(String[] args) {
		
		int opcao;
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("# ## ### #### #########     Menu     ########## #### ### ## #");
		System.out.println("\n-- Digite 1 para ver Indicação de um Livro --");
		System.out.println("\n-- Digite 2 para ver ler uma Frase Motivacional --");
		System.out.println("\n-- Digite 3 para receber uma Indicação de música --");
		
		opcao = scanner.nextInt();
		
		switch (opcao) {
		
		case 1:
			System.out.println("Livro: Como fazer amigos e influenciar pessoas");
		break;
		
		case 2:
			System.out.println("Frase motivacional: Se você cair, levante! Não da pra andar deitado");
		break;
		
		case 3:
			System.out.println("Música: Michael Jackson - Thriller");
		break;
		
			default:
				System.out.println("A opção é inválida, digite um valor válido.");
				break;
		
		}
		scanner.close();
	}
	}
