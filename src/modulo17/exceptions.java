package modulo17;

import java.util.Scanner;

public class exceptions {

	static Scanner ler = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		int dividendo = 0;
		int divisor = 0;
			
		System.out.println("Digite o Dividendo: ");
		dividendo = ler.nextInt();
				
		System.out.println("Digite o Divisor: ");
		divisor = ler.nextInt();
				
		divide(dividendo, divisor);
		
	}

	public static void divide(int dividendo, int divisor) {
		System.out.println("Divisão = " + (dividendo / divisor));
	}

}