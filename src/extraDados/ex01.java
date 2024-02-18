package extraDados;

import java.util.Scanner;
import java.util.Stack;

public class ex01 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Stack<Integer> pilha = new Stack<>();
        int num;
        
        for (int i = 0; i < 10; i++) {
        	System.out.println("Digite o " + (i+1) + "° número: ");
        	num = scanner.nextInt();
        	
        	if (num % 2 == 0) {
        		pilha.push(num);
        	} else {
        		if (pilha.isEmpty()) {
        			System.out.println("A pilha está vazia!");
        			return;
        		} else {
        			pilha.pop();
        		}
        		
        	}
        	
        	if (i == 9) {
        		if (!pilha.isEmpty()) {
        			System.out.println(pilha);
        			
        		}
        		scanner.close(); // Fechando o scanner
        	}
            
        }

    }
}