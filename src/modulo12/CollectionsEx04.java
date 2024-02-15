package modulo12;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class CollectionsEx04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		Set<Integer> colecaoNumeros = new HashSet<Integer>();
		int numero, aim;
		
		for (int i = 0; i < 10; i++) {
			System.out.print("Digite o " + (i+1) + "° número: \n");
			numero = scanner.nextInt();
			colecaoNumeros.add(numero);
		}
		
		System.out.print("Digite o número que você deseja encontrar: ");
		aim = scanner.nextInt();
		
		if (colecaoNumeros.contains(aim)) {
			System.out.println("O número " + aim + " foi encontrado!");
		} else {
			System.out.println("O número " + aim + " não foi encontrado!");
		}

		scanner.close(); // Fechando o scanner
	}
}
