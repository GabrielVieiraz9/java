package modulo09;

import java.util.Scanner;

public class ex05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int opcao, qnt;
		float total;
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite código do produto de 1 a 6: ");
		System.out.println("1 ------ Cachorro Quente ----- R$10.00");
		System.out.println("2 ------ X-Salada ----- R$15.00");
		System.out.println("3 ------ X-Bacon ----- R$18.00");
		System.out.println("4 ------ Bauru ----- R$12.00");
		System.out.println("5 ------ Refrigerante ----- R$8.00");
		System.out.println("6 ------ Suco de laranja ----- R$13.00");
		opcao = scanner.nextInt();

		System.out.println("Digite a quantidade do item: ");	
		qnt = scanner.nextInt();
		
		switch (opcao) {
		
		case 1:
			System.out.println("Produto: Cachorro Quente");
			total = 10*qnt;
			System.out.printf("Valor total: R$ %.2f", total);
		break;
		
		case 2:
			System.out.println("Produto: X-Salada");
			total = 15*qnt;
			System.out.printf("Valor total: R$ %.2f", total);
		break;
		
		case 3:
			System.out.println("Produto: X-Bacon");
			total = 18*qnt;
			System.out.printf("Valor total: R$ %.2f", total);
		break;
		
		case 4:
			System.out.println("Produto: Bauru");
			total = 12*qnt;
			System.out.printf("Valor total: R$ %.2f", total);
		break;
		
		case 5:
			System.out.println("Produto: Refrigerante");
			total = 8*qnt;
			System.out.printf("Valor total: R$ %.2f", total);
		break;
		
		case 6:
			System.out.println("Produto: Suco de laranja");
			total = 13*qnt;
			System.out.printf("Valor total: R$ %.2f", total);
		break;
		
			default:
				System.out.println("A opção é inválida, digite um valor válido.");
				break;
		
		}
		scanner.close();
	}

}
