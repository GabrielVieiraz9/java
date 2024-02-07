package modulo08;
import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite a nota 1: ");
		float nota1 = scanner.nextFloat();
		
		System.out.println("Digite a nota 2: ");
		float nota2 = scanner.nextFloat();
		
		System.out.println("Digite a nota 3: ");
		float nota3 = scanner.nextFloat();
		
		System.out.println("Digite a nota 4: ");
		float nota4 = scanner.nextFloat();
		
		float media = (nota1 + nota2 + nota3 + nota4)/4;
		
		double mediaArredondada = Math.round(media * 10.0) / 10.0; // 1 casa decimal
		
        System.out.printf("A média é: %.1f", mediaArredondada);
	}

}