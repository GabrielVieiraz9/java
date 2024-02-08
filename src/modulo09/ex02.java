package modulo09;

import java.util.Scanner;

public class ex02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int numero;
    
    Scanner scanner = new Scanner(System.in);
    
	System.out.println("Digite um número: ");
	numero = scanner.nextInt();
	
	if (numero % 2 == 0 && numero >= 0) {
		System.out.println("O Número " + numero + " é par e positivo");
	} else if (numero % 2 != 0 && numero < 0) {
		System.out.println("O Número " + numero + " é ímpar e negativo");
	} else if (numero % 2 == 0 && numero < 0) {
		System.out.println("O Número " + numero + " é par e negativo");
	} else {
		System.out.println("O Número " + numero + " é ímpar e positivo");
	}
	
}

}
