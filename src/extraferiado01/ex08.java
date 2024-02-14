package extraferiado01;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class ex08 {

    public static void main(String[] args) {
        int pontosX = 0, pontosY = 0, dificuldade = 5, respostaX, respostaY, aleatorio;
        boolean continuar = true;

        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        do {
            int minIntervalo = 1; // Intervalo mínimo
            int maxIntervalo = (int) dificuldade; // Intervalo máximo
        	
            aleatorio = random.nextInt(dificuldade) + 1; // Gerando número aleatório de 1 a 5
            

            List<Integer> listaX = new ArrayList<>();
            List<Integer> listaY = new ArrayList<>();
            boolean ciclo = true;

            do {
            	System.out.println("O número aleatório é um valor entre " + minIntervalo + " e " + maxIntervalo + ": ");
                System.out.println("Digite um número (Jogador 1): ");
                respostaX = scanner.nextInt();
                listaX.add(respostaX);

                if (respostaX == aleatorio) {
                    pontosX += 2*(dificuldade/5); // Adicionando 10 pontos se o jogador 1 acertar
                    break; // Encerrando o ciclo se o jogador 1 acertar
                } else {
                    System.out.println("Número errado! Tente novamente. \n");
                }

                System.out.println("Digite um número (Jogador 2): ");
                respostaY = scanner.nextInt();
                listaY.add(respostaY);

                if (respostaY == aleatorio) {
                    pontosY += 2*(dificuldade/5); // Adicionando 10 pontos se o jogador 2 acertar
                    ciclo = false; // Encerrando o ciclo se o jogador 2 acertar
                } else {
                    System.out.println("Número errado! Tente novamente. \n");
                }
                System.out.println("Respostas do Jogador 1: " + listaX);
                System.out.println("Respostas do Jogador 2: " + listaY + "\n");

            } while (ciclo);
            
            System.out.println("Pontos do Jogador 1: " + pontosX + "\n");
            System.out.println("Pontos do Jogador 2: " + pontosY + "\n");

            System.out.println("Deseja continuar? (sim/não)");
            String continuarStr = scanner.next();
            continuar = continuarStr.equalsIgnoreCase("sim");
            
            if (continuar) {
                dificuldade += Math.pow(dificuldade, 1.3); // Incrementando a dificuldade em 2
            }


        } while (continuar);
        
        
        if (pontosX > pontosY) {
        	System.out.println("Jogador 1 venceu com " + pontosX + " pontos");
        } else if (pontosY > pontosX) {
        	System.out.println("Jogador 2 venceu com " + pontosY + " pontos");
        } else {
        	System.out.println("O jogo empatou!");
        	System.out.println("Jogador 1: " + pontosX + " pontos");
        	System.out.println("Jogador 2: " + pontosY + " pontos");
        }
        
        System.out.println("Fim de jogo!");

        scanner.close();
    }
}