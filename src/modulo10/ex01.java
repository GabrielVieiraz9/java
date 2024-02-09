package modulo10;

import java.util.Scanner;

public class ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		int num1, num2;
		
		System.out.println("Digite o primeiro número do intervalo: ");
		num1 = scanner.nextInt();
		
		System.out.println("Digite o último número do intervalo: ");
		num2 = scanner.nextInt();
		
		
		if (num2 > num1) {
			System.out.println("No intervalo entre " + num1 + " e " + num2);
			for (int i = num1; i <= num2; i++) {
				if (i % 3 == 0 && i % 5 == 0) {
					System.out.println(i + " é múltiplo de 3 e 5");
				}
			}
		} else {
			System.out.println("Intervalo inválido!");
		}
		scanner.close();
	}

}
