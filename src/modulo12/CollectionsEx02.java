package modulo12;

import java.util.ArrayList;
import java.util.Scanner;

public class CollectionsEx02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> numeros = new ArrayList<Integer>();
		Scanner scanner = new Scanner(System.in);
		
		int numero, aim;
		
		for (int i = 0; i < 10; i++) {
			System.out.print("Digite o " + (i+1) + "° número: \n");
			numero = scanner.nextInt();
			numeros.add(numero);
		}
		
		System.out.print("Digite o número que você deseja encontrar: ");
		aim = scanner.nextInt();
		
        int index = numeros.indexOf(aim); //método para achar o índice correspondente dado um número
        if (index != -1) {
            System.out.println("O número " + aim + " está localizado na posição: " + index);
        } else {
            System.out.println("O número " + aim + " não foi encontrado!");
        }
        
        scanner.close(); // Fechando o scanner
	}

}