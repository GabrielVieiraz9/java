package extraferiado01;

import java.util.Random;
import java.util.Scanner;

public class ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random random = new Random();
		Scanner scanner = new Scanner(System.in);
		
		int numeroAleatorio = random.nextInt(101);
		int numero;
		
		do {
			System.out.println("Digite um número: ");
			numero = scanner.nextInt();
			
			int resultado = Math.abs(numero - numeroAleatorio);
			
			if (numero != numeroAleatorio) {
				System.out.println("(Errou! Tente novamente)\n");
				if (resultado >= 50) {
					System.out.println("O numero está muito longe!");
				} else if (resultado >= 20 && resultado < 50) {
					System.out.println("O numero está ficando mais perto, mais ainda está longe!");
				} else if (resultado >= 10 && resultado < 20) {
					System.out.println("O numero está ficando mais perto!");
				} else if (resultado >= 5 && resultado < 10) {
					System.out.println("O numero está muito perto!");
				}  else if (resultado >= 1 && resultado < 5) {
					System.out.println("O numero está extremamente perto!");
				}
				
			} else {
				System.out.println("Acertou! o número aleatório é: " + numeroAleatorio);
			}
		} while (numero != numeroAleatorio);
		
		
		
		
		System.out.println("Número aleatório: " + numeroAleatorio);
		scanner.close();
	}

}
