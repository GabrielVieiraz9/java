package modulo08;

import java.util.Scanner;

public class Ex03 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite o saláio bruto: ");
		float salarioBruto = scanner.nextFloat();
		
		System.out.println("Digite o adicional noturno: ");
		float adicionalNoturno = scanner.nextFloat();
		
		System.out.println("Digite o ganho com horas extras: ");
		float horasExtras = scanner.nextFloat();
		
		System.out.println("Digite o total dos descontos: ");
		float descontos = scanner.nextFloat();
		
		float salarioLiquido = salarioBruto + adicionalNoturno + (horasExtras*5) - descontos;
		
		double salarioArredondado = Math.round(salarioLiquido * 10.0) / 10.0; // 1 casa decimal
		
		System.out.printf("O salário líquido é: %.2f", salarioArredondado);
	}
}
