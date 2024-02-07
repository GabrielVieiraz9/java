package modulo08;

import java.util.Scanner;

public class Ex04 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite o primeiro número: ");
		Integer n1 = scanner.nextInt();
		
		System.out.println("Digite o segundo número: ");
		Integer n2 = scanner.nextInt();
		
		System.out.println("Digite o terceiro número: ");
		Integer n3 = scanner.nextInt();
		
		System.out.println("Digite o quato número: ");
		Integer n4 = scanner.nextInt();
		
		Integer diferenca = (n1 * n2) - (n3 * n4);
		
		System.out.println("A diferença é: " + diferenca);
	}

}
