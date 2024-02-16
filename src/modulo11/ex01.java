package modulo11;

import java.util.Scanner;

public class ex01 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Quantos números deseja inserir no vetor?");
        int tamanho = scanner.nextInt();
        int[] vetor = new int[tamanho];
        
        for (int i = 0; i < vetor.length; i++) {
            System.out.println("Digite o " + (i+1) + "° número:");
            vetor[i] = scanner.nextInt();
        }
        
        boolean continuar = true;

        do {
            System.out.println("Digite um número para pesquisar no vetor:");
            int numero = scanner.nextInt();

            int posicao = pesquisarNumero(vetor, numero);

            if (posicao != -1) {
                System.out.println("O número " + numero + " foi encontrado na posição " + posicao + " do vetor.\n");
            } else {
                System.out.println("Não foi encontrado!");
            }

            System.out.println("Deseja continuar? (Sim/Não)");
            String continuarOpcao = scanner.next();
            if (!continuarOpcao.equalsIgnoreCase("Sim")) {
                continuar = false;
            }

        } while (continuar);

        System.out.println("Programa encerrado.");
        scanner.close();
    }

    public static int pesquisarNumero(int[] vetor, int numero) {
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] == numero) {
                return i; // Retorna a posição se o número for encontrado
            }
        }
        return -1; // Retorna -1 se o número não for encontrado
    }
}