package modulo08;
import java.util.Scanner;

public class Ex01 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o Salário: ");
        float salarioInicial;
        try {
            salarioInicial = scanner.nextFloat();
        } catch (NumberFormatException e) {
            System.out.println("Entrada inválida. Por favor, insira um número válido.");
            return;
        }

        System.out.println("Digite o Abono: ");
        float abono;
        try {
            abono = scanner.nextFloat();
        } catch (NumberFormatException e) {
            System.out.println("Entrada inválida. Por favor, insira um número válido.");
            return;
        }

        float novoSalario = salarioInicial + abono;

        // Formata o novo salário para duas casas decimais

        System.out.printf("Seu salário é: %.2f", novoSalario);
    }
}