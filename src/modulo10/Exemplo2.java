package modulo10;
import java.util.Scanner;
public class Exemplo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String continua = "s";
		int num1, num2, resultado;
		Scanner scanner = new Scanner(System.in);
		
		while (!continua.equals("n")) {
            System.out.println("Digite primeiro valor: ");
            num1 = scanner.nextInt();

            System.out.println("Digite segundo valor: ");
            num2 = scanner.nextInt();

            resultado = num1 + num2;

            System.out.println("O resultado da soma é: " + resultado);

            System.out.println("\n++++++++++++++++MENU++++++++++++++++++");
            System.out.println("\nDeseja somar dois valores?");
            System.out.println("\nDigite s para sim OU digite n para não: ");
            continua = scanner.next();
            System.out.println("++++++++++++++++++++++++++++++++++");
		}
		scanner.close();
	}

}
