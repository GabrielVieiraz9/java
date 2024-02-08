package modulo09;

public class testeLaco2 {
	public static void main(String[] args) {
	
		int n1=4, n2=3, n3=4;
		
		if (n1 < 5) {
			System.out.println("O número 1 é menor que o 5.");
		}
		
		if (n1 < n2) {
			System.out.println("O número 1 é menor que o 2.");
		}
		
		if (n1 == n3) {
			System.out.println("O número 1 e o número 3 são iguais.");
		}
		
		
		if (n1 < 5 && n2 < 5 && n3 < 5) {
			System.out.println("Todas as condicóes são verdadeiras.");
		}
	}

}
