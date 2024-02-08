package modulo09;

import java.util.Scanner;

public class ex04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    String vertebra, tipo, alimento;
	    
	    Scanner scanner = new Scanner(System.in);
	    
		System.out.println("O animal é vertebrado ou invertebrado? ");
		vertebra = scanner.next();
		
		System.out.println("Qual é o tipo de animal? (ave, mamifero, inseto ou anelideo)");
		tipo = scanner.next();
		
		System.out.println("qual tipo de alimento este animal come? (carnivoro, onivoro, herbivoro ou hematofago)");
		alimento = scanner.next();
		
		if (vertebra.equalsIgnoreCase("vertebrado")) {
			
			if (tipo.equalsIgnoreCase("ave")) {
				
				if (alimento.equalsIgnoreCase("carnivoro")) {
					System.out.println("Águia");
				} else if (alimento.equalsIgnoreCase("onivoro")) {
					System.out.println("Pomba");
				} else {
					System.out.println("Digite um valor valido");
				}
				
			} else if (tipo.equalsIgnoreCase("mamifero")) {
				
				if (alimento.equalsIgnoreCase("onivoro")) {
					System.out.println("Homem");
				} else if (alimento.equalsIgnoreCase("herbivoro")) {
					System.out.println("Vaca");
				} else {
					System.out.println("Digite um valor valido");
				}
				
			}
				
		} else if (vertebra.equalsIgnoreCase("invertebrado")) {
			   if (tipo.equalsIgnoreCase("inseto")) {
					
					if (alimento.equalsIgnoreCase("hematofago")) {
						System.out.println("Pulga");
					} else if (alimento.equalsIgnoreCase("herbivoro")) {
						System.out.println("Lagarta");
					} else {
						System.out.println("Digite um valor valido");
					}
				}   else if (tipo.equalsIgnoreCase("anelideo")) {
					
					if (alimento.equalsIgnoreCase("hematofago")) {
						System.out.println("Sanguessuga");
					} else if (alimento.equalsIgnoreCase("onivoro")) {
						System.out.println("Minhoca");
					} else {
						System.out.println("Digite um valor valido");
					}
				} else {
					System.out.println("Digite um valor valido");
				}
		
		} else {
			System.out.println("Digite um valor valido: ");
		}
		
	}

}
