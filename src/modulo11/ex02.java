package modulo11;

import java.util.Scanner;
import java.text.DecimalFormat;

public class ex02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] inteiros = new int[10];
		
		boolean repetido; // Variável para verificar se o número digitado já existe no vetor
		
		Scanner scanner = new Scanner(System.in);
		
	    for (int i = 0; i < inteiros.length; i++) {
            do {
                repetido = false; // Inicializa como falso a cada iteração
                
                System.out.println("Digite o " + (i+1) + "º número:");
                int numero = scanner.nextInt();
                
                // Verifica se o número já existe no vetor
                for (int j = 0; j < i; j++) {
                    if (inteiros[j] == numero) {
                        repetido = true; // Se existir, marca como repetido
                        System.out.println("Número já digitado. Digite outro número.");
                        break; // Sai do loop interno
                    }
                }
                
                if (!repetido) {
                    inteiros[i] = numero; // Se não for repetido, armazena no vetor
                }
            } while (repetido); // Repete o processo enquanto o número for repetido
        }
	    
	    System.out.print("Elementos nos índices ímpares: \n");
	    for (int i = 0; i < inteiros.length; i++) {
	    	if (i % 2 != 0) { // Se o índice é ímpar, imprimir o valor na posição correspondente	
	            System.out.print(inteiros[i] + " ");
	    	}
	    }
	    
	    System.out.println();
	    System.out.print("\n");
	    
	    System.out.print("Elementos pares: \n");
	    for (int i = 0; i < inteiros.length; i++) {
	    	if (inteiros[i] % 2 == 0) { // Se o índice é ímpar, imprimir o valor na posição correspondente
	            System.out.print(inteiros[i] + " ");
	    	}
	    }
	    
	    System.out.println();
	    System.out.print("\n");
	    
	    System.out.print("Soma: ");
	    int soma = 0;
	    for (int i = 0; i < inteiros.length; i++) {
	    	soma += inteiros[i];
	    	
	    }
	    System.out.println(soma); // Imprima a soma total após o término do loop
	    
	    double media = (double) soma/inteiros.length;
	    
	    DecimalFormat df = new DecimalFormat("#0.00"); // Define o formato para duas casas decimais
	    String mediaFormatada = df.format(media);
	    
	    System.out.print("Média: ");
	    System.out.println(mediaFormatada); 
	    
        
        scanner.close();
    }
}