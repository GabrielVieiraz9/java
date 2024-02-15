package modulo11;

import java.util.Scanner;

public class ex04 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double[][] matriz = new double[10][4];
        double[] medias = new double[10]; // Vetor para armazenar as médias das linhas

        // Solicitar ao usuário para inserir os elementos da matriz
        for (int i = 0; i < 10; i++) {
            double somaLinha = 0;
            for (int j = 0; j < 4; j++) {
                System.out.println("Digite o elemento da posição [" + i + "][" + j + "]: ");
                matriz[i][j] = scanner.nextDouble();
                somaLinha += matriz[i][j];
            }
            // Calcular a média da soma dos valores para a linha e armazenar no vetor
            double mediaLinha = somaLinha / 4; // Média da soma dos valores para a linha
            mediaLinha = Math.round(mediaLinha * 10.0) / 10.0; // Arredondar para uma casa decimal
            medias[i] = mediaLinha; // Armazenar a média no vetor
        }

        // Exibir o vetor de médias
        System.out.println("Médias das linhas:");
        for (int i = 0; i < 10; i++) {
            System.out.print(medias[i] + " ");
        }

        scanner.close();
    }
}
