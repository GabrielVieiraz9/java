package modulo09;
import java.util.Scanner;

public class ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int A=2, B=4, C=5;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite o número A: ");
		A = scanner.nextInt();
		
		System.out.println("Digite o número B: ");
		B = scanner.nextInt();
		
		System.out.println("Digite o número C: ");
		C = scanner.nextInt();
		
		if (A + B > C){
			System.out.println("A Soma de A + B é Maior do que C");
		} else if (A + B == C){
			System.out.println("A Soma de A + B é Igual a C");
		} else {
			System.out.println("A Soma de A + B é Menor do que C");
		}	
		scanner.close();
	}
}