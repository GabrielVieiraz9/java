package modulo09;

import java.util.Scanner;

public class ex03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    
	String nome, doacao;
	int idade;
	boolean primeiraDoacao = false;
    
    Scanner scanner = new Scanner(System.in);
    
	System.out.println("Digite seu nome: ");
	nome = scanner.nextLine();
	
	
	System.out.println("Digite sua idade: ");
	idade = scanner.nextInt();
	
	System.out.println("Primeira doação de sangue (S/N)?");
	doacao = scanner.next();
		
    if (!doacao.equalsIgnoreCase("S") && !doacao.equalsIgnoreCase("s") && !doacao.equalsIgnoreCase("N") && !doacao.equalsIgnoreCase("n")) {
        System.out.println("Erro: Resposta inválida.");
        return; // Encerra o programa
    }
    
	
	if (doacao.equalsIgnoreCase("S") || doacao.equalsIgnoreCase("s")) {
    	primeiraDoacao = true;
    }
    
    if (idade >= 18 && idade <= 69) {
    	if (idade >= 60) {
    		if (primeiraDoacao == false) {
    			System.out.println(nome + " está apto para doar sangue!");
    		} else {
    			System.out.println(nome + " não está apto para doar sangue!");
    		}
    	} else {
    		System.out.println(nome + " está apto para doar sangue!");
    	}
   	
    } else {
    	System.out.println(nome + " não está apto para doar sangue!");
    }
    	
  }
 	
}
