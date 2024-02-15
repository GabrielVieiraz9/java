package modulo11;

import java.util.Scanner;

public class ex03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int linha, coluna, somaPrincipal = 0, somaSecundaria = 0;
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("digite o numero de linhas da matriz: ");
		linha = scanner.nextInt();
		
		System.out.println("digite o numero de colunas da matriz: ");
		coluna = scanner.nextInt();
		
		int [][] matriz = new int[linha][coluna];
		
        // Solicitar ao usuário para inserir os elementos da matriz
        for (int i = 0; i < linha; i++) {
            for (int j = 0; j < coluna; j++) {
                System.out.println("Digite o elemento da posição [" + i + "][" + j + "]: ");
                matriz[i][j] = scanner.nextInt();
            }
        }
        
        // Exibir a matriz
        System.out.println("Matriz inserida:");
        for (int i = 0; i < linha; i++) {
            for (int j = 0; j < coluna; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("\n");
        
        System.out.println("Elementos da diagonal principal:");
        for (int i = 0; i < linha; i++) {
            System.out.print(matriz[i][i] + " ");
            
            somaPrincipal += matriz[i][i];
        }
        System.out.println("\n");

        System.out.println("Elementos da diagonal secundária:");
        for (int i = 0; i < linha; i++) {
            System.out.print(matriz[i][linha - i - 1] + " ");
            
            somaSecundaria += matriz[i][linha - i - 1];
            
        }
        System.out.println("\n");
        System.out.println("Soma dos Elementos da Diagonal Principal:" + somaPrincipal);
        
        System.out.println("Soma dos Elementos da Diagonal Secundária:" + somaSecundaria);

        scanner.close();

	}

}