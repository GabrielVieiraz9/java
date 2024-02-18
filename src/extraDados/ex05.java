package extraDados;

import java.util.Scanner;
import java.util.Stack;

public class ex05 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite uma palavra ou frase para verificar se é um palíndromo:");
        String input = scanner.nextLine();

        if (isPalindrome(input)) {
            System.out.println("É um palíndromo!");
        } else {
            System.out.println("Não é um palíndromo.");
        }

        scanner.close();
    }

    public static boolean isPalindrome(String str) {
        // Removendo espaços em branco e convertendo para minúsculas para evitar problemas de comparação
        str = str.replaceAll("\\s+", "").toLowerCase();

        Stack<Character> stack = new Stack<>();

        // Adiciona metade dos caracteres na pilha
        int length = str.length();
        for (int i = 0; i < length / 2; i++) {
            stack.push(str.charAt(i));
        }

        // Verifica se a segunda metade dos caracteres é igual à primeira metade invertida
        for (int i = (length + 1) / 2; i < length; i++) {
            if (str.charAt(i) != stack.pop()) {
                return false;
            }
        }

        return true;
    }
}
