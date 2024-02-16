package modulo09;

import java.util.Scanner;

public class testeLacoEncadeado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float nota1, nota2, media;
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite a primeira nota: ");
		nota1 = scanner.nextFloat();
		
		System.out.println("Digite a segunda nota: ");
		nota2 = scanner.nextFloat();
		
		media = (nota1 + nota2)/2;
		
		if(media >= 6) {
			System.out.println("Passou de ano");
		} else if (media >= 5) {
			System.out.println("Está de exame");
		}
		else {
			System.out.println("Não passou de ano");
		}
		
		System.out.printf("A sua média é: " + media);
		scanner.close();
	}

}
