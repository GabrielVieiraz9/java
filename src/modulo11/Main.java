package modulo11;

import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		Random megaSena = new Random();
		
		int aleatorio = megaSena.nextInt(0, 101);
		scanner.nextLine();
		System.out.println(aleatorio);
	}

}
