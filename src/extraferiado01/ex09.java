package extraferiado01;

import java.util.Scanner;

public class ex09 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite um número: ");
        int numeroMaximo = scanner.nextInt();
        
        int primosParesEncontrados = contarPrimosPares(numeroMaximo);
        
        System.out.println("A porcentagem de primos pares encontrados entre 0 e " + numeroMaximo + ": " + ((double)primosParesEncontrados/numeroMaximo * 100) + "%");
    }

    public static int contarPrimosPares(int numeroMaximo) {
        int primosParesEncontrados = 0;

        for (int i = 0; i <= numeroMaximo; i++) {
            if (i % 2 == 0 && ehPrimo(i)) {
                primosParesEncontrados++;
            }
        }

        return primosParesEncontrados;
    }

    public static boolean ehPrimo(int numero) {
        if (numero <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }
}