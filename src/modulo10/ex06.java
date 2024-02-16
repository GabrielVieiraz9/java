package modulo10;

import java.util.Scanner;

public class ex06 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero, soma = 0;
        int divisao = 0;

        do {
            System.out.println("Digite um número (digite 0 para encerrar): ");
            numero = scanner.nextInt();
            
            if (numero != 0 && numero % 3 == 0) {
                soma += numero;
                divisao++;
            }
        } while (numero != 0);

        double mediaMultiplos3 = 0;
        if (divisao > 0) {
            mediaMultiplos3 = (double) soma / divisao;
        }

        System.out.println("A média de todos os números múltiplos de 3 é: " + mediaMultiplos3);

        scanner.close();
    }
}