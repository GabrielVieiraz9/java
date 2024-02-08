package modulo09;

import java.util.Scanner;

public class ex08 {

    public static void main(String[] args) {
        float saldo = 1000, saque, deposito;
        int codigo;

        Scanner scanner = new Scanner(System.in);

        // Loop principal
        while (true) {
            System.out.println("Digite o código da operação (ou 0 para sair): ");

            System.out.println("Digite código do cargo de 1 a 3: ");
            System.out.println("1 ------ Saldo");
            System.out.println("2 ------ Saque");
            System.out.println("3 ------ Depósito");
            System.out.println("0 ------ Sair");

            codigo = scanner.nextInt();

            switch (codigo) {
                case 0:
                    System.out.println("Saindo do programa...");
                    return; // Sai do programa
                case 1:
                    System.out.println("Saldo: R$ " + saldo);
                    // Solicita ao usuário que pressione Enter para voltar ao menu
                    pausarPrograma(scanner);
                    break;
                case 2:
                    System.out.println("Digite a quantidade de saque: ");
                    saque = scanner.nextFloat();
                    if (saque <= saldo) {
                        saldo -= saque;
                        System.out.println("Saque de R$ " + saque + " realizado com sucesso.");
                        // Solicita ao usuário que pressione Enter para voltar ao menu
                        pausarPrograma(scanner);
                    } else {
                        System.out.println("Saldo insuficiente para realizar o saque.");
                        // Solicita ao usuário que pressione Enter para voltar ao menu
                        pausarPrograma(scanner);
                    }
                    break;
                case 3:
                    System.out.println("Digite a quantidade de depósito: ");
                    deposito = scanner.nextFloat();
                    saldo += deposito;
                    System.out.println("Depósito de R$ " + deposito + " realizado com sucesso.");
                    // Solicita ao usuário que pressione Enter para voltar ao menu
                    pausarPrograma(scanner);
                    break;
                default:
                    System.out.println("A opção é inválida, digite um valor válido.");
                    break;
            }
        }
    }

    // Método para pausar o programa até que o usuário pressione Enter
    public static void pausarPrograma(Scanner scanner) {
        System.out.println("Pressione Enter para voltar ao menu...");
        scanner.nextLine(); // Limpa o buffer do scanner
        scanner.nextLine(); // Aguarda a entrada do usuário (pressionar Enter)
    }
}
