package modulo10;

import java.util.Scanner;

public class Exemplo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub;
		Scanner leia = new Scanner(System.in);
		
		int numero, resultado, contador = 3;
		
		do {
			System.out.println("Digite um numero inteiro");
			numero = leia.nextInt();
			resultado = numero * 5;
			System.out.println("\n O resultado da multiplicação é: " + resultado);	
		} while (contador <= 2);
		
		leia.close();
	}

}
