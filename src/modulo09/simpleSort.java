package modulo09;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;

public class simpleSort {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> lista = new ArrayList<>(); //criar uma array
		Scanner scanner = new Scanner(System.in);
		
        for (int i = 0; i < 3; i++) {
            System.out.println("Digite o " + (i+1) + "° número: ");
            int numero = scanner.nextInt();
            lista.add(numero);
        }
        
        Collections.sort(lista);
        scanner.close();
        System.out.println("Lista de números digitados em ordem crescente: " + lista + "\n");
        
        for (int i = 0; i < 3; i++) {
        	System.out.println(lista.get(i));
        }
        
        
		
	}

}