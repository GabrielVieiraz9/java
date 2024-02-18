package extraDados;

import java.util.Scanner;
import java.util.Stack;

public class ex02 {

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        Stack<Integer> pilhaPar = new Stack<>();
	        Stack<Integer> pilhaImpar = new Stack<>();
	        int num;
	        
	        for (int i = 0; i < 10; i++) {
	        	System.out.println("Digite o " + (i+1) + "° número: ");
	        	num = scanner.nextInt();
	        	
	        	if (num % 2 == 0 && num != 0) {
	        		pilhaPar.push(num);
	        	} else if (num % 2 != 0 && num != 0) {
	        		pilhaImpar.push(num);
	        		
	        	} else {
	        		pilhaPar.pop();
	        		pilhaImpar.pop();
	        	}
	        	           
	        }
	        
	        if (pilhaPar.isEmpty() || pilhaImpar.isEmpty()) {
	        	System.out.println("As pilhas estão vazias!");
	        } else {
	        	System.out.println("Pilha par: ");
	        	System.out.println(pilhaPar + "\n");
	        	System.out.println("Pilha ímpar: ");
	        	System.out.println(pilhaImpar);
	        }
	        scanner.close(); // Fechando o scanner

	    }
}