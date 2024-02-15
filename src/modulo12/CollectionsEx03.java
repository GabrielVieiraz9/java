package modulo12;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.Scanner;

public class CollectionsEx03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		Set<Integer> colecaoNumeros = new HashSet<Integer>();
		int numero;
		
		for (int i = 0; i < 10; i++) {
			System.out.print("Digite o " + (i+1) + "° número: \n");
			numero = scanner.nextInt();
			colecaoNumeros.add(numero);
		}
		
        System.out.print("\n Listar dados do Set: \n");
        Iterator<Integer> iNumerosOrdenados = colecaoNumeros.iterator();
        
        while (iNumerosOrdenados.hasNext()) {
            System.out.println(iNumerosOrdenados.next());
        }
        
        scanner.close(); // Fechando o scanner
	}

}
