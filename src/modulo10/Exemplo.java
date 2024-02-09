package modulo10;
import java.util.Scanner;

public class Exemplo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     String nome;
     int contador;
     try (Scanner leia = new Scanner(System.in)) {
		for (contador = 1; contador < 4; contador++) {
		     System.out.println("\nDigite o " + contador + "º nome: ");
		     nome = leia.nextLine();
		     System.out.println("O " + contador + "º nome é: " + nome);
		 }
		 leia.close();
	}
	}
}
