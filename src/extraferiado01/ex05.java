package extraferiado01;

import java.util.Random;
import java.util.HashSet;
import java.util.Set;

public class ex05 {


    public static void main(String[] args) {
        Set<Integer> numerosEscolhidos = new HashSet<>();
        Random random = new Random();
        int incremento = 0;

        do {
            int numeroAleatorio;
            do {
                numeroAleatorio = random.nextInt(1000) + 1; // Gera um número aleatório entre 1 e 1000
            } while (!numerosEscolhidos.add(numeroAleatorio)); // Repete até encontrar um número único

            if (numeroAleatorio == 1) {
                System.out.println("Encontrou a bolinha preta! Tentativa de número: " + (incremento + 1));
                break;
            } else {

            }
            incremento++;
        } while (true);
    }
}