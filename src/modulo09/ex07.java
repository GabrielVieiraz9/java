package modulo09;

import java.util.Scanner;

public class ex07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float numero1, numero2, operacao;
		int codigo;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite o 1º número: ");
		numero1 = scanner.nextFloat();
		
		System.out.println("Digite o 2º número: ");
		numero2 = scanner.nextFloat();
		
		System.out.println("Digite o código da operação (1 a 4): ");
		System.out.println("1 ------ Soma");
		System.out.println("2 ------ Subtração");
		System.out.println("3 ------ Multiplicação");
		System.out.println("4 ------ Divisão");
		
		codigo = scanner.nextInt();
		
		switch (codigo) {
		case 1:		
			operacao = numero1 + numero2;
			System.out.println(numero1 + " + " + numero2 + " " + "= " + operacao);
		break;
		case 2:	
			operacao = numero1 - numero2;
			System.out.println(numero1 + " - " + numero2 + " " + "= " + operacao);
		break;
		case 3:
			operacao = numero1 * numero2;
			System.out.println(numero1 + " * " + numero2 + " " + "= " + operacao);
		break;
		case 4:
			operacao = numero1 / numero2;
			System.out.println(numero1 + " / " + numero2 + " " + "= " + operacao);
		break;
		
		default:
			System.out.println("A opção é inválida, digite um valor válido.");
			break;
		
	}

}
}
