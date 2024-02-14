package extraferiado01;

import java.util.Random;
import java.util.Scanner;
import java.util.ArrayList;

public class ex04 {

    public static void main(String[] args) {
        final int totalBolinhas = 10;
        boolean encontrouBolinhaPreta = false;

        ArrayList<Integer> escolhas = new ArrayList<>();

        // Simulação: bolinhas no saco (9 brancas, 1 preta)
        String[] bolinhas = new String[totalBolinhas];
        
        // Inicializando todas as bolinhas como "Branca"
        for (int i = 0; i < totalBolinhas; i++) {
            bolinhas[i] = "Branca";
        }

        // Colocando a bolinha preta em uma posição aleatória
        Random random = new Random();
        int posicaoPreta = random.nextInt(totalBolinhas);
        bolinhas[posicaoPreta] = "Preta";

        // Embaralhando as bolinhas
        embaralharBolinhas(bolinhas);

        // Inicializando scanner
        Scanner scanner = new Scanner(System.in);

        int escolha;
        do {
            // Solicitar ao usuário que escolha uma bolinha
            System.out.println("Escolha uma bolinha:");
            
            // Imprimir opções disponíveis
            System.out.print("Opções disponíveis: ");
            for (int i = 0; i < totalBolinhas; i++) {
                if (!escolhas.contains(i + 1)) {
                    System.out.print((i + 1) + " ");
                }
            }
            System.out.println();

            // Ler a escolha do usuário
            escolha = scanner.nextInt();

            // Verificar se a escolha é válida
            if (escolha < 1 || escolha > totalBolinhas || escolhas.contains(escolha)) {
                System.out.println("Escolha inválida ou já escolhida. Tente novamente.");
                continue;
            }

            // Exibir a cor da bolinha escolhida pelo usuário
            String cor = bolinhas[escolha - 1];
            System.out.println("A bolinha escolhida é " + cor);

            // Verificar se a bolinha escolhida é preta
            switch (cor) {
                case "Preta":
                    encontrouBolinhaPreta = true;
                    System.out.println("Você encontrou a bolinha preta! Parabéns!");
                    break;
                case "Branca":
                    System.out.println("Você escolheu uma bolinha branca. Tente novamente.\n");
                    escolhas.add(escolha);
                    break;
            }

        } while (!encontrouBolinhaPreta);

        // Fechar o scanner
        scanner.close();
    }

    // Método para embaralhar as bolinhas
    private static void embaralharBolinhas(String[] bolinhas) {
        Random random = new Random();
        for (int i = 0; i < bolinhas.length; i++) {
            int j = random.nextInt(bolinhas.length);
            String temp = bolinhas[i];
            bolinhas[i] = bolinhas[j];
            bolinhas[j] = temp;
        }
    }
}