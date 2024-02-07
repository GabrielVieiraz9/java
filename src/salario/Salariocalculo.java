package salario;
import java.util.Scanner;

public class Salariocalculo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite o Salário: ");
		float salarioInicial = scanner.nextFloat();
		
		System.out.println("Digite o Abono: ");
		float abono = scanner.nextFloat();
		
		float novoSalario = salarioInicial + abono;
		
		System.out.println("Seu novo salário é: " + novoSalario);
		
	}

}
