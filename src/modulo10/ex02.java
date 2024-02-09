package modulo10;

import java.util.ArrayList;
import java.util.Scanner;

public class ex02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numero; 
		ArrayList<Integer> pares = new ArrayList<>();
		ArrayList<Integer> impares = new ArrayList<>();
		
		Scanner scanner = new Scanner(System.in);
		
		for(int i = 0; i < 10; i++) {
			System.out.println("Digite o " + (i+1) + "° valor: ");
			numero = scanner.nextInt();
			if (numero % 2 == 0) {
				pares.add(numero);
			} else {
				impares.add(numero);
			}
		}
		
		int totalPares = pares.size();
		int totalImpares = impares.size();
		
		System.out.println("Número de elementos pares: " + totalPares);
		System.out.println("Número de elementos pares: " + totalImpares);
		
		scanner.close();
	}

}
