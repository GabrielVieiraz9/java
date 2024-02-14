package extraferiado01;

import java.util.Scanner;

public class ex07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ano;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Digite o ano de seu nascimento: ");
		ano = scanner.nextInt();
		
		if (ano >= 1946 && ano <= 1964) {
			System.out.println("Geração: Baby Boomers");
		} else if (ano >= 1965 && ano <= 1980) {
			System.out.println("Geração: X");
		} else if (ano >= 1981 && ano <= 1996) {
			System.out.println("Geração: Y ou Millennials");
		} else if (ano >= 1997 && ano <= 2009) {
			System.out.println("Geração: Z");
		} else if (ano >= 2010 && ano <= 2024) {
			System.out.println("Geração: Alfa");
		} else {
			System.out.println("Digite um ano válido");
		}
		scanner.close();
	}

}
