package modulo10;

import java.util.Scanner;

public class ex05 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int controle; // Não inicialize aqui, pois a variável será inicializada dentro do loop

        int soma = 0;

        do {
            System.out.println("Digite um número: ");
            controle = scanner.nextInt();
            
            if (controle > 0) {
            soma += controle; // Adiciona o número à soma
            }
        } while (controle != 0);

        System.out.println("A soma dos números digitados é: " + soma);

        scanner.close();
    }
}