package modulo10;

import java.util.ArrayList;
import java.util.Scanner;

public class ex03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int idade = 0; 
		ArrayList<Integer> menores = new ArrayList<>();
		ArrayList<Integer> maiores = new ArrayList<>();
		
		Scanner scanner = new Scanner(System.in);
		

			
		while (idade >= 0) {
			System.out.println("Digite uma idade: ");
			idade = scanner.nextInt();
			if (idade > 50) {
				maiores.add(idade);
			} else if (idade < 21) {
				menores.add(idade);
			}
		}
		
		int totalMaiores = maiores.size();
		int totalMenores = menores.size();
		
		System.out.println("Número de elementos pares: " + totalMaiores);
		System.out.println("Número de elementos pares: " + totalMenores);
		
		scanner.close();
	}
}
